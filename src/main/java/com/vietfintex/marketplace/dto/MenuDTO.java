package com.vietfintex.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuDTO {
    private Long menuId;
    private Long parentMenuId;
    private String menuKey;
    private String url;
    private String icon;
    private String order;
    private List<MenuDTO> childMenu;

    public Long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<MenuDTO> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<MenuDTO> childMenu) {
        this.childMenu = childMenu;
    }

    public void addChildMenu(MenuDTO menu){
        if (isNull(this.childMenu)){
            this.childMenu = new ArrayList<>();
        }
        childMenu.add(menu);
    }
}
