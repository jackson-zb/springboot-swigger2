package ink.zhaibo.controller;

import ink.zhaibo.dto.UserRequest;
import ink.zhaibo.dto.UserResponse;
import ink.zhaibo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(description = "用户模块")
@RestController
@RequestMapping("/users")
public class UserController {

    @ApiOperation(value = "创建用户", notes = "")
    //@ApiImplicitParam(name = "user", value = "请求内容", paramType = "body", required = true, dataType = "User")
    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user) {
        System.out.println(user.toString());
        //业务逻辑
        return "ok";
    }

    @ApiOperation(value = "查询用户详情", notes = "根据id查询用户详情")
    @ApiImplicitParam(name = "request", value = "请求实体", paramType = "body", required = true, dataType = "UserRequest")
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public UserResponse getUser(@RequestBody UserRequest request) {
        System.out.println(request.toString());
        UserResponse response = new UserResponse();
        response.setBalance("100.00");
        response.setNickname("Jack");
        response.setSex("Male");
        return response;
    }

    @ApiOperation(value = "查询用户")
    @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true, dataType = "string")
    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
    public User getById(@PathVariable String uid) {
        System.out.println(uid);
        User user = new User();
        user.setNickname("kokoma");
        user.setUid(2);
        return user;
    }

}
