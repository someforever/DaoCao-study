package com.daocao.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ums_sys_user")

public class UmsUysUser implements Serializable {
    @TableId
    //使用包装类。为什么呢？
    private Long id;
    private String username;
    private String nickname;
    private String email;
    private String mobile;
    //用Integer
    private Integer sex;
    private String avatar;
    private String password;
    private Integer status;
    private String creator;
    private String updater;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remark;
    //逻辑删除，MyBatis-PUs默认0是未删除，1是已删除
    @TableLogic
    private Integer deleted;
}
