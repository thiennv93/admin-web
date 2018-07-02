package com.vietfintex.marketplace.service;

import com.vietfintex.marketplace.dto.ResponseDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "status-service", url = "http://localhost:8080/status")
public interface StatusService {
    @GetMapping
    @ResponseBody
    ResponseDTO search();

}
