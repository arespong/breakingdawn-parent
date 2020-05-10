package com.miracle.ucenter_auth.service;

import com.miracle.framework.domain.system.SysRole;
import com.miracle.framework.domain.system.ext.SysUserExt;
import com.miracle.ucenter_auth.client.SysUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserClient sysUserClient;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        //SysUserExt sysUserExt = sysUserClient.getSysUserExt(loginName);
        User user = new User("allen","$2a$10$DDNk7hOXDyIF9KhqCw0lm.q1AJJRGmWDaad.8wPNy416y1iXrptGG",true, true, true, true, Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
        return user;
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<SysRole> sysRoles) {
        return sysRoles.stream().map(sysRole -> new SimpleGrantedAuthority("ROLE_" + sysRole.getRoleName())).collect(Collectors.toList());
    }
}
