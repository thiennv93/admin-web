package com.vietfintex.marketplace.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vietfintex.marketplace.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.dto.ResponseDTO;
import com.vietfintex.marketplace.dto.StatusDTO;
import com.vietfintex.marketplace.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.service.ProductFeatureService;
import com.vietfintex.marketplace.service.StatusService;
import com.vietfintex.marketplace.service.UserService;
import org.apache.log4j.Logger;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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
public class ProductFeatureController extends AbstractController<ProductFeatureDTO, ProductFeatureDTO> implements Serializable {
    private static final Logger logger = Logger.getLogger(ProductFeatureController.class);
    @Autowired
    private ProductFeatureService productFeatureService;
    @Autowired
    private StatusService statusService;
    private LazyDataModel<ProductFeatureDTO> lazyListItem;
    private LazyDataModel<ProductFeatureDTO> lazyListItemGroupFeature;
    private List<ProductFeatureDTO> ProductFeatureDTOList;
    private List<ProductFeatureDTO> filteredFeatureList;
    private List<StatusDTO> statusList;
    private ProductFeatureDTO searchDTO;
    private ProductFeatureDTO ProductFeatureDTO;
    @PostConstruct
    public void init(){
//        ResponseDTO response = statusService.search("feature");
//        if (response.isSuccess() && nonNull(response.getObjectReturn())){
//            statusList = (List<StatusDTO>) response.getObjectReturn();
//        }else{
//            statusList = new ArrayList<>();
//        }
        resetSearchForm();
//        doSearch();
    }

    @Override
    public void resetSearchForm() {
        if (isNull(searchDTO)){
            searchDTO = new ProductFeatureDTO();
        }else {
            searchDTO.setDescription(null);
            searchDTO.setParentFeatureName(null);
        }
    }

    @Override
    public void validateAction(int actionMode) {

    }

    @Override
    public void prepareDisplayMode(int viewMode, Boolean changeModeOnly) {
        this.displayMode = viewMode;
        if (MODE_ADD == viewMode) {
            ProductFeatureDTO = new ProductFeatureDTO();
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
    public void doPrepareAction(ProductFeatureDTO ProductFeatureDTO, int action) throws Exception {
        if (ACTION_EDIT == action) {
            this.ProductFeatureDTO = ProductFeatureDTO;
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
            lazyListItem = new LazyDataModel<ProductFeatureDTO>() {
                @Override
                public List<ProductFeatureDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                    List<ProductFeatureDTO> lazyList = null;
                    try {
                        Map<String, Object> param = new HashMap<>();
                        param.put("searchDTO", searchDTO);
                        param.put("startPage", first);
                        param.put("pageSize", pageSize);
                        ResponseDTO response = productFeatureService.search(param);
                        if (response.isSuccess() && nonNull(response.getObjectReturn())){
                            lazyList = (List<ProductFeatureDTO>) response.getObjectReturn();
                        }
                    } catch (Exception e) {
                        logger.error(e, e);
                        reportError("", "msg.error.call.ws");
                    }
                    return lazyList;
                }

                @Override
                public ProductFeatureDTO getRowData(String rowKey) {
                    List<ProductFeatureDTO> data = (List<ProductFeatureDTO>) getWrappedData();
                    for (ProductFeatureDTO feature : data) {
                        if (String.valueOf(feature.getFeatureId()).equals(rowKey)) {
                            return feature;
                        }
                    }
                    return null;
                }

                @Override
                public Object getRowKey(ProductFeatureDTO object) {
                    return object.getFeatureId();
                }
            };
            Map<String, Object> param = new HashMap<>();
            param.put("searchDTO", searchDTO);
            ResponseDTO responseDTO = productFeatureService.count(param);
            if (responseDTO.isSuccess() && nonNull(responseDTO.getObjectReturn())){
                lazyListItem.setRowCount((int) responseDTO.getObjectReturn());
            }
        } catch (Exception e) {
            logger.error(e, e);
            reportError("", "msg.error.system");
        }
    }

    public void onChangeStatus(Long userId, String status){
//        ResponseDTO responseDTO = userService.findByUserId(userId);
//        FacesContext context = FacesContext.getCurrentInstance();
//        if (!responseDTO.isSuccess() || isNull(responseDTO.getObjectReturn())){
//            reportError(null, "msg.error.user.update", responseDTO.getErrorMessage());
//        }else {
//            ObjectMapper mapper = new ObjectMapper();
//            ProductFeatureDTO ProductFeatureDTO = mapper.convertValue(responseDTO.getObjectReturn(), ProductFeatureDTO.class);
//            ProductFeatureDTO.setStatus(status);
//            ResponseDTO updateResponse = userService.update(ProductFeatureDTO);
//            if(!updateResponse.isSuccess() || isNull(responseDTO.getObjectReturn())){
//                reportError(null, "msg.error.user.update", responseDTO.getErrorMessage());
//            }else{
//                reportSuccess(null, "msg.success.user.update");
//            }
//        }
//        context.getPartialViewContext().getRenderIds().add("usersForm:usersTable");

    }

    public LazyDataModel<com.vietfintex.marketplace.dto.ProductFeatureDTO> getLazyListItemGroupFeature() {
        return lazyListItemGroupFeature;
    }

    public void setLazyListItemGroupFeature(LazyDataModel<com.vietfintex.marketplace.dto.ProductFeatureDTO> lazyListItemGroupFeature) {
        this.lazyListItemGroupFeature = lazyListItemGroupFeature;
    }

    public LazyDataModel<ProductFeatureDTO> getLazyListItem() {
        return lazyListItem;
    }

    public void setLazyListItem(LazyDataModel<ProductFeatureDTO> lazyListItem) {
        this.lazyListItem = lazyListItem;
    }

    public List<ProductFeatureDTO> getProductFeatureDTOList() {
        return ProductFeatureDTOList;
    }

    public void setProductFeatureDTOList(List<ProductFeatureDTO> ProductFeatureDTOList) {
        this.ProductFeatureDTOList = ProductFeatureDTOList;
    }

    public List<ProductFeatureDTO> getFilteredFeatureList() {
        return filteredFeatureList;
    }

    public void setFilteredFeatureList(List<ProductFeatureDTO> filteredFeatureList) {
        this.filteredFeatureList = filteredFeatureList;
    }

    public ProductFeatureDTO getSearchDTO() {
        return searchDTO;
    }

    public void setSearchDTO(ProductFeatureDTO searchDTO) {
        this.searchDTO = searchDTO;
    }

    public List<StatusDTO> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<StatusDTO> statusList) {
        this.statusList = statusList;
    }

    public ProductFeatureDTO getProductFeatureDTO() {
        return ProductFeatureDTO;
    }

    public void setProductFeatureDTO(ProductFeatureDTO ProductFeatureDTO) {
        this.ProductFeatureDTO = ProductFeatureDTO;
    }
}
