package com.miracle.framework.domain.system.requset;

import lombok.Data;

@Data
public class QuerySysMenuRequest {
    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单状态:0显示,1隐藏
     */
    private String visible;
}
