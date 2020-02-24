package com.htdata.firstboot.controller;

import com.htdata.firstboot.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
@Api("用户相关的api")
@RestController
@RequestMapping("/user")
public class FristBootController {
    /*
    为一个接口做注释，说明该接口的职能
     */
    @ApiOperation("根据ID获取用户信息")
    /*
    通常用来包含接口的一组参数注解，即参数注解的集合
     */
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "用户的ID", defaultValue = "1")})
    @ApiResponses({@ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对"
            )})
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public User getUserInfo(@RequestParam("id") int id) {
        if (id == 1) {
            return new User(1, "王开业", "123456");
        }
        if (id == 2) {
            return new User(2, "刘德华", "123456");
        }
        return new User(3, "张学友", "123456");
    }
}

