package com.vietfintex.adminfaces.starter.persistence.service;

import com.vietfintex.adminfaces.starter.persistence.model.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> findTop10OrderByTimestamp();
}
