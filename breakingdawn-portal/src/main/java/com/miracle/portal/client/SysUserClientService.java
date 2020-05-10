package com.miracle.portal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-MANAGE-SYSTEM")
public interface SysUserClientService {

    @GetMapping("/system/user/echo")
    String getEcho(@RequestParam int a);

    @PostMapping("/system/user/echo")
    String getEcho1(int a);
}
