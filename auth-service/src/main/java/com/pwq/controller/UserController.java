package com.pwq.controller;

import com.pwq.model.RestResponse;
import com.pwq.model.dto.UserDto;
import com.pwq.model.entity.User;
import com.pwq.model.vo.UserVo;
import com.pwq.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    public RestResponse getUserById(@RequestParam Integer id) {
        User user = userService.retrieveById(id);

        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return RestResponse.ofSuccess(userVo);
    }

    @PutMapping("/addUser")
    public RestResponse addUser(@RequestBody UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);

        user = userService.create(user);

        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return RestResponse.ofSuccess(userVo);
    }
}
