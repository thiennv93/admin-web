package com.vietfintex.marketplace.service;

import com.vietfintex.marketplace.dto.ResponseDTO;
import com.vietfintex.marketplace.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "user-service", url = "http://localhost:8080/users")
public interface UserService {
    @PostMapping(value = "/login-admin")
    @ResponseBody
    public ResponseDTO login(Map<String, String> param);

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    ResponseDTO search(@RequestBody Map<String, Object> param);

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO count(@RequestBody Map<String, Object> param);

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    ResponseDTO findByUserId(@PathVariable("userId") final Long userId);

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    ResponseDTO update(@RequestBody UserDTO user);

}
