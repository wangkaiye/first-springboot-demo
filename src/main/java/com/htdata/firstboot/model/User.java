package com.htdata.firstboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
/*
用来为一个POJO类做注释
 */
@ApiModel("用户模型")
/*
lombok注解，用来为POJO类生成全参构造器
 */
@AllArgsConstructor
@Getter
public class User {
    @ApiModelProperty("用户ID")
    private int id;
    /*
    用来为POJO类中的属性做注释
     */
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户密码")
    private String password;

}
