package com.vietfintex.marketplace.service;

import com.vietfintex.marketplace.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.dto.ResponseDTO;
import com.vietfintex.marketplace.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "product-feature-service", url = "http://localhost:8080/feature")
public interface ProductFeatureService {
    @PostMapping(value = "/search")
    @ResponseBody
    ResponseDTO search(@RequestBody final Map<String, Object> param);

    @PostMapping(value = "/count")
    @ResponseBody
    ResponseDTO count(@RequestBody Map<String, Object> param);
}
