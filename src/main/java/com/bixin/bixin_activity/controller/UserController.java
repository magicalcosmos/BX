package com.bixin.bixin_activity.controller;

import com.bixin.bixin_activity.pojo.ResponseMessage;
import com.bixin.bixin_activity.pojo.User;
import com.bixin.bixin_activity.pojo.dto.UserDto;
import com.bixin.bixin_activity.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 接口返回对象，转换成JSON文本
@RequestMapping("/user") //
public class UserController {
    @Autowired
    IUserService userService;

    // 增加
    @PostMapping
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user) {
        User newUser = userService.add(user);
        return ResponseMessage.success(newUser);
    }

    // 查询
    @GetMapping("/{userId}")
    public ResponseMessage<User> get(@PathVariable Integer userId) {
        User newUser = userService.getUser(userId);
        return ResponseMessage.success(newUser);
    }

    // 修改
     @PutMapping
     public ResponseMessage<User> edit(@Validated @RequestBody UserDto user) {
         User newUser = userService.edit(user);
         return ResponseMessage.success(newUser);
     }
    // 删除
     @DeleteMapping
     public ResponseMessage<User> del(@PathVariable Integer userId) {
        userService.delete(userId);
        return ResponseMessage.success();
     }
}
