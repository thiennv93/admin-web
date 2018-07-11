package com.vietfintex.marketplace.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vietfintex.marketplace.dto.ResponseDTO;
import com.vietfintex.marketplace.dto.StatusDTO;
import com.vietfintex.marketplace.dto.UserDTO;
import com.vietfintex.marketplace.service.StatusService;
import com.vietfintex.marketplace.service.UserService;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
@ViewScoped
@ManagedBean
public class UserController extends AbstractController<UserDTO, UserDTO> implements Serializable {
    private static final Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private StatusService statusService;
    private LazyDataModel<UserDTO> lazyListItem;
    private List<UserDTO> userDTOList;
    private List<UserDTO> filteredUserList;
    private List<StatusDTO> statusList;
    private UserDTO searchDTO;
    private UserDTO userDTO;
    @PostConstruct
    public void init(){
        ResponseDTO response = statusService.search("user");
        if (response.isSuccess() && nonNull(response.getObjectReturn())){
            statusList = (List<StatusDTO>) response.getObjectReturn();
        }else{
            statusList = new ArrayList<>();
        }
        resetSearchForm();
        doSearch();
    }

    @Override
    public void resetSearchForm() {
        if (isNull(searchDTO)){
            searchDTO = new UserDTO();
        }else {
            searchDTO.setEmail(null);
            searchDTO.setPhone(null);
            searchDTO.setUserName(null);
        }
    }

    @Override
    public void validateAction(int actionMode) {

    }

    @Override
    public void prepareDisplayMode(int viewMode, Boolean changeModeOnly) {
        this.displayMode = viewMode;
        if (MODE_ADD == viewMode) {
            userDTO = new UserDTO();
        } else if (MODE_VIEW == viewMode) {
            doSearch();
        } else if (MODE_EDIT == viewMode) {
        }
    }

    @Override
    public void doActionListener(int actionMode) {

    }

    @Override
    public String getMessageConfirm(int actionMode) {
        return null;
    }

    @Override
    public void doDelete() {

    }

    @Override
    public void doPrepareAction(UserDTO userDTO, int action) throws Exception {
        if (ACTION_EDIT == action) {
            this.userDTO = userDTO;
            prepareDisplayMode(MODE_EDIT, false);
        } else if (ACTION_CLONE == action) {
            prepareDisplayMode(MODE_ADD,  false);
        }
    }

    @Override
    public void doEdit() {

    }

    @Override
    public void doSave() {

    }

    @Override
    public void doSearch() {

        try {
            lazyListItem = new LazyDataModel<UserDTO>() {
                @Override
                public List<UserDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                    List<UserDTO> lazyList = null;
                    try {
                        Map<String, Object> param = new HashMap<>();
                        param.put("searchDTO", searchDTO);
                        param.put("startPage", first);
                        param.put("pageSize", pageSize);
                        ResponseDTO response = userService.search(param);
                        if (response.isSuccess() && nonNull(response.getObjectReturn())){
                            lazyList = (List<UserDTO>) response.getObjectReturn();
                        }
                    } catch (Exception e) {
                        logger.error(e, e);
                        reportError("", "msg.error.call.ws");
                    }
                    return lazyList;
                }

                @Override
                public UserDTO getRowData(String rowKey) {
                    List<UserDTO> data = (List<UserDTO>) getWrappedData();
                    for (UserDTO user : data) {
                        if (user.getUserId().equals(rowKey)) {
                            return user;
                        }
                    }
                    return null;
                }

                @Override
                public Object getRowKey(UserDTO object) {
                    return object.getUserId();
                }
            };
            Map<String, Object> param = new HashMap<>();
            param.put("searchDTO", searchDTO);
            ResponseDTO responseDTO = userService.count(param);
            if (responseDTO.isSuccess() && nonNull(responseDTO.getObjectReturn())){
                lazyListItem.setRowCount((int) responseDTO.getObjectReturn());
            }
        } catch (Exception e) {
            logger.error(e, e);
            reportError("", "msg.error.system");
        }
    }

    public void onChangeStatus(Long userId, String status){
        ResponseDTO responseDTO = userService.findByUserId(userId);
        FacesContext context = FacesContext.getCurrentInstance();
        if (!responseDTO.isSuccess() || isNull(responseDTO.getObjectReturn())){
            reportError(null, "msg.error.user.update", responseDTO.getErrorMessage());
        }else {
            ObjectMapper mapper = new ObjectMapper();
            UserDTO userDTO = mapper.convertValue(responseDTO.getObjectReturn(), UserDTO.class);
            userDTO.setStatus(status);
            ResponseDTO updateResponse = userService.update(userDTO);
            if(!updateResponse.isSuccess() || isNull(responseDTO.getObjectReturn())){
                reportError(null, "msg.error.user.update", responseDTO.getErrorMessage());
            }else{
                reportSuccess(null, "msg.success.user.update");
            }
        }
        context.getPartialViewContext().getRenderIds().add("usersForm:usersTable");

    }

    public LazyDataModel<UserDTO> getLazyListItem() {
        return lazyListItem;
    }

    public void setLazyListItem(LazyDataModel<UserDTO> lazyListItem) {
        this.lazyListItem = lazyListItem;
    }

    public List<UserDTO> getUserDTOList() {
        return userDTOList;
    }

    public void setUserDTOList(List<UserDTO> userDTOList) {
        this.userDTOList = userDTOList;
    }

    public List<UserDTO> getFilteredUserList() {
        return filteredUserList;
    }

    public void setFilteredUserList(List<UserDTO> filteredUserList) {
        this.filteredUserList = filteredUserList;
    }

    public UserDTO getSearchDTO() {
        return searchDTO;
    }

    public void setSearchDTO(UserDTO searchDTO) {
        this.searchDTO = searchDTO;
    }

    public List<StatusDTO> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<StatusDTO> statusList) {
        this.statusList = statusList;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
