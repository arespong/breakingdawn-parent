package com.miracle.manage_system;

import com.github.pagehelper.PageInfo;
import com.miracle.framework.domain.system.SysUser;
import com.miracle.manage_system.dao.SystemUserMapper;
import com.miracle.manage_system.service.ISystemUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SystemApplicationTest {
    @Autowired
    private SystemUserMapper systemUserMapper;

    @Autowired
    private ISystemUserService systemUserService;
    @Test
    public void test(){
        System.out.println(systemUserMapper.selectById(1));
    }
    @Test
    public void testList(){
        PageInfo<SysUser> pageInfo = systemUserService.list(0, 2, null);
        System.out.println(pageInfo);
        pageInfo.getList().stream().forEach(System.out::println);
    }
}
