package com.bixin.bixin_activity.service;

import com.bixin.bixin_activity.pojo.User;
import com.bixin.bixin_activity.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 添加用户
     * @param user 参数
     */
    User add(UserDto user);

    /**
     * 查询用户
     * @param userId 用户ID
     * @return
     */
    User getUser(Integer userId);

    /**
     * 修改用户
     * @param user 修改的用户对象
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除用户
     *
     * @param userId 用户ID
     */
    void delete(Integer userId);
}
