package com.vietfintex.marketplace.controller;


import com.vietfintex.marketplace.i18n.AdminUTF8Bundle;
import com.vietfintex.marketplace.util.Constants;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.extensions.component.masterdetail.MasterDetail;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.text.MessageFormat;

import static org.springframework.util.StringUtils.isEmpty;


public abstract class AbstractController<SearchDTO, DTO> implements IController, Serializable {

    public static final Logger logger = Logger.getLogger(AbstractController.class);
    private AdminUTF8Bundle languageBundle = new AdminUTF8Bundle();

    protected final int MODE_VIEW = 0;
    protected final int MODE_ADD = 1;
    protected final int MODE_EDIT = 2;

    protected final int ACTION_NONE = 0;
    protected final int ACTION_SEARCH = 1;
    protected final int ACTION_SAVE = 2;
    protected final int ACTION_DELETE = 3;
    protected final int ACTION_EDIT = 4;
    protected final int ACTION_CLONE = 5;

    protected int displayMode;
    protected int actionMode = ACTION_NONE;

    public abstract void doPrepareAction(DTO dto, int action) throws Exception;

    public void doAction(int mode) {
        if (mode == ACTION_SEARCH) {
            doSearch();
        } else if (mode == ACTION_SAVE) {
            doSave();
        } else if (mode == ACTION_DELETE) {
            doDelete();
        } else if (mode == ACTION_EDIT) {
            doEdit();
        }
    }



    public String getText(String key) {
        return languageBundle.getString(key);
    }

    public String getTextParam(String key, Object... params) {
        return MessageFormat.format(getText(key), params);
    }


    public void reportSuccess(String displayArea, String keyMsg, Object... params) {
        displayArea = isEmpty(displayArea) ? Constants.REMOTE_GROWL : displayArea;
        FacesContext.getCurrentInstance().addMessage(displayArea, new FacesMessage(FacesMessage.SEVERITY_INFO, "", MessageFormat.format(getText(keyMsg), params)));
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(displayArea);
    }

    public void reportError(String displayArea, String keyMsg, Object... params) {
        displayArea = isEmpty(displayArea) ? Constants.REMOTE_GROWL : displayArea;
        FacesContext.getCurrentInstance().addMessage(displayArea, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", MessageFormat.format(getText(keyMsg), params)));
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(displayArea);
    }


    public HttpServletRequest getRequest() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext extenalContext = facesContext.getExternalContext();
        return (HttpServletRequest) extenalContext.getRequest();
    }

    public void reportErrorValidateFail(String displayArea, String keyMsg, Object...params) {
        reportError(displayArea, keyMsg, params);
        FacesContext.getCurrentInstance().validationFailed();
    }


    public void showDialog(String keyInfo, String keyMesg) {
        try {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, getText(keyInfo), getText(keyMesg));
            RequestContext.getCurrentInstance().showMessageInDialog(facesMessage);
        } catch (Exception ex) {
            logger.error("", ex);
        }
    }
    public void focusElement(String widgetVar) {
        RequestContext.getCurrentInstance().execute("focusElement('" + widgetVar + "')");
    }

    public void focusElementWithCursor(String cssSelector) {
        RequestContext.getCurrentInstance().execute("focusElementWithCursor('" + cssSelector + "')");
    }
    public void showErrorToElement(String selector) {
        RequestContext.getCurrentInstance().execute("showErrorToElement('" + selector + "')");
    }

    public void showDialog(String widgetVar) {
        RequestContext.getCurrentInstance().execute("PF('" + widgetVar + "').show()");
    }

    public void hideDialog(String widgetVar) {
        RequestContext.getCurrentInstance().execute("PF('" + widgetVar + "').hide()");
    }

    public void topPage() {
        RequestContext.getCurrentInstance().execute("topPage()");
    }

    public void focusElementError(String elementId) {
        RequestContext.getCurrentInstance().execute("focusElementError('" + elementId + "')");
    }

    public void removeFocusElementError(String elementId) {
        RequestContext.getCurrentInstance().execute("removeFocusElementError('" + elementId + "')");
    }

    public void updateElemetId(String elementId) {
        RequestContext.getCurrentInstance().update(elementId);
    }

    public int getMODE_VIEW() {
        return MODE_VIEW;
    }

    public int getMODE_ADD() {
        return MODE_ADD;
    }

    public int getMODE_EDIT() {
        return MODE_EDIT;
    }

    public int getACTION_NONE() {
        return ACTION_NONE;
    }

    public int getACTION_SEARCH() {
        return ACTION_SEARCH;
    }

    public int getACTION_SAVE() {
        return ACTION_SAVE;
    }

    public int getACTION_DELETE() {
        return ACTION_DELETE;
    }

    public int getACTION_EDIT() {
        return ACTION_EDIT;
    }

    public int getACTION_CLONE() {
        return ACTION_CLONE;
    }

    public int getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(int displayMode) {
        this.displayMode = displayMode;
    }

    public int getActionMode() {
        return actionMode;
    }

    public void setActionMode(int actionMode) {
        this.actionMode = actionMode;
    }
}
