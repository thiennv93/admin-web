package com.vietfintex.adminfaces.starter.persistence.repo;

import com.vietfintex.adminfaces.starter.persistence.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Long> {
    List<Orders> findTop10OrderByTimestamp();
}
