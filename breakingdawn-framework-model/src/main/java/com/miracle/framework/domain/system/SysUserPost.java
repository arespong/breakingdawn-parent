package com.miracle.framework.domain.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.miracle.framework.domain.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName
public class SysUserPost {
    /** 用户ID */
    private Long userId;

    /** 岗位ID */
    private Long postId;
}
