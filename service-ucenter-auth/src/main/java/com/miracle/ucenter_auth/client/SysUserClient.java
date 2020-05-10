package com.miracle.ucenter_auth.client;

import com.miracle.framework.domain.system.ext.SysUserExt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-MANAGE-SYSTEM")
public interface SysUserClient {

    @GetMapping("/system/user/getSysUserExt")
    SysUserExt getSysUserExt(@RequestParam String loginName);

}
