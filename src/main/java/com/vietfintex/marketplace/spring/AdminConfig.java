package com.vietfintex.marketplace.spring;

import com.vietfintex.marketplace.util.Constants;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;


/**
 * Created by rafael-pestano on 22/11/16.
 */
//@Named
//@ApplicationScoped
//@ApplicationScoped
@ViewScoped
@ManagedBean(name = "adminConfig")
public class AdminConfig implements Serializable {

    private static final Logger log = Logger.getLogger(AdminConfig.class.getName());

    private Properties adminConfigFile;//default config
    private Properties userConfigFile;//user defined properties
    private String loginPage;
    private String indexPage;
    private String dateFormat;
    private String templatePath;
    private Integer breadCrumbMaxSize;
    private boolean renderMessages;
    private boolean renderAjaxStatus;
    private boolean disableFilter;
    private boolean enableRipple;
    private boolean renderBreadCrumb;
    private boolean extensionLessUrls;
    private boolean enableSlideMenu;
    private String rippleElements;
    private String skin;
    private boolean autoShowNavbar;
    private String ignoredResources;//comma separated resources (pages or urls) to be ignored in AdminFilter
    private String loadingImage;
    private boolean renderControlSidebar;


    @PostConstruct
    public void init() {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        adminConfigFile = new Properties();
        userConfigFile = new Properties();
        try (InputStream is = cl.getResourceAsStream(("admin-config.properties"))) {
            userConfigFile.load(is);
        } catch (Exception ex) {
            log.log(Level.WARNING,"Could not load user defined admin template properties. Falling back to default properties.");
        }

        try (InputStream isDefault = cl.getResourceAsStream(("admin-config.properties"))) {
            adminConfigFile.load(isDefault);
        } catch (Exception ex) {
            log.log(Level.SEVERE,"Could not load admin template default properties.", ex);
        }

        loadDefaults();
    }

    protected void loadDefaults() {
        loginPage = getProperty("admin.loginPage");
        indexPage = getProperty("admin.indexPage");
        dateFormat = getProperty("admin.dateFormat");
        if(nonNull(dateFormat)) {
            dateFormat =  ((SimpleDateFormat)DateFormat.getDateTimeInstance()).toLocalizedPattern();
        }
        templatePath = getProperty("admin.templatePath");
        breadCrumbMaxSize = Integer.parseInt(getProperty("admin.breadcrumbSize"));
        renderMessages = Boolean.parseBoolean(getProperty("admin.renderMessages"));
        renderAjaxStatus = Boolean.parseBoolean(getProperty("admin.renderAjaxStatus"));
        disableFilter = Boolean.parseBoolean(getProperty("admin.disableFilter"));
        enableRipple = Boolean.parseBoolean(getProperty("admin.enableRipple"));
        renderBreadCrumb = Boolean.parseBoolean(getProperty("admin.renderBreadCrumb"));
        extensionLessUrls = Boolean.parseBoolean(getProperty("admin.extensionLessUrls"));
        rippleElements = getProperty("admin.rippleElements");
        enableSlideMenu =  Boolean.parseBoolean(getProperty("admin.enableSlideMenu"));
        skin = getProperty("admin.skin");
        autoShowNavbar =  Boolean.parseBoolean(getProperty("admin.autoShowNavbar"));
        ignoredResources =  getProperty("admin.ignoredResources");
        loadingImage =  getProperty("admin.loadingImage");
        renderControlSidebar =  Boolean.parseBoolean(getProperty("admin.renderControlSidebar"));
    }

    private String getProperty(String property) {
        return isNull(userConfigFile.getProperty(property)) ? userConfigFile.getProperty(property) : adminConfigFile.getProperty(property);
    }
    
    public String getPageSufix() {
          if(nonNull(indexPage)) {
            return Constants.DEFAULT_PAGE_FORMAT;
        }
        return indexPage.substring(indexPage.lastIndexOf('.')+1);
    }


    public String getLoginPage() {
        return loginPage;
    }

    public String getIndexPage() {
        return indexPage;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public void setIndexPage(String indexPage) {
        this.indexPage = indexPage;
    }

    public boolean isDisableFilter() {
        return disableFilter;
    }

    public void setDisableFilter(boolean disableFilter) {
        this.disableFilter = disableFilter;
    }

    @Deprecated
    /**
     * @deprecated use LayoutMB#template
     */
    public String getTemplatePath() {
        return templatePath;
    }

    public Integer getBreadCrumbMaxSize() {
        return breadCrumbMaxSize;
    }

    public void setBreadCrumbMaxSize(Integer breadCrumbMaxSize) {
        this.breadCrumbMaxSize = breadCrumbMaxSize;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public boolean isRenderMessages() {
        return renderMessages;
    }

    public void setRenderMessages(boolean renderMessages) {
        this.renderMessages = renderMessages;
    }

    public boolean isRenderAjaxStatus() {
        return renderAjaxStatus;
    }

    public void setRenderAjaxStatus(boolean renderAjaxStatus) {
        this.renderAjaxStatus = renderAjaxStatus;
    }

    public boolean isEnableRipple() {
        return enableRipple;
    }

    public void setEnableRipple(boolean enableRipple) {
        this.enableRipple = enableRipple;
    }

    public boolean isRenderBreadCrumb() {
        return renderBreadCrumb;
    }

    public void setRenderBreadCrumb(boolean renderBreadCrumb) {
        this.renderBreadCrumb = renderBreadCrumb;
    }

    public boolean isExtensionLessUrls() {
        return extensionLessUrls;
    }

    public void setExtensionLessUrls(boolean extensionLessUrls) {
        this.extensionLessUrls = extensionLessUrls;
    }

    public String getRippleElements() {
        return rippleElements;
    }

    public void setRippleElements(String rippleElements) {
        this.rippleElements = rippleElements;
    }

    public boolean isEnableSlideMenu() {
        return enableSlideMenu;
    }

    public void setEnableSlideMenu(boolean enableSlideMenu) {
        this.enableSlideMenu = enableSlideMenu;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public boolean isAutoShowNavbar() {
        return autoShowNavbar;
    }

    public void setAutoShowNavbar(boolean autoShowNavbar) {
        this.autoShowNavbar = autoShowNavbar;
    }

    public String getIgnoredResources() {
        return ignoredResources;
    }

    public void setIgnoredResources(String ignoredResources) {
        this.ignoredResources = ignoredResources;
    }

    public String getLoadingImage() {
        return loadingImage;
    }

    public void setLoadingImage(String loadingImage) {
        this.loadingImage = loadingImage;
    }

    public boolean isRenderControlSidebar() {
        return renderControlSidebar;
    }

    public void setRenderControlSidebar(boolean renderControlSidebar) {
        this.renderControlSidebar = renderControlSidebar;
    }
    
    
}
