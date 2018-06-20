package com.vietfintex.adminfaces.starter.persistence.service.impl;

import com.vietfintex.adminfaces.starter.persistence.model.Orders;
import com.vietfintex.adminfaces.starter.persistence.repo.OrderRepo;
import com.vietfintex.adminfaces.starter.persistence.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSeviceImpl implements OrderService {
    @Autowired
    private OrderRepo repository;

    @Override
    public List<Orders> findTop10OrderByTimestamp() {
        return repository.findTop10OrderByTimestamp();
    }
}
