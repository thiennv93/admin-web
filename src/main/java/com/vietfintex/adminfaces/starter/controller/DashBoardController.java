package com.vietfintex.adminfaces.starter.controller;

import com.vietfintex.adminfaces.starter.ApplicationContextProvider;
import com.vietfintex.adminfaces.starter.persistence.model.Orders;
import com.vietfintex.adminfaces.starter.persistence.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.jsf.FacesContextUtils;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
@ViewScoped
@ManagedBean
public class DashBoardController {
    @Autowired
    private OrderService orderService;
    private List<Orders> orderLatestList;

    private List<Orders> filteredOrders;

    @PostConstruct
    public void init(){
//        orderService = ApplicationContextProvider.getApplicationContext().getBean(OrderService.class);
        orderLatestList = orderService.findAll();
    }

    public List<Orders> getOrderLatestList() {
        return orderLatestList;
    }

    public void setOrderLatestList(List<Orders> orderLatestList) {
        this.orderLatestList = orderLatestList;
    }

    public List<Orders> getFilteredOrders() {
        return filteredOrders;
    }

    public void setFilteredOrders(List<Orders> filteredOrders) {
        this.filteredOrders = filteredOrders;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
