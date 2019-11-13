package com.lyz.blog.service;


import com.lyz.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;


/**
 * User 服务接口.
 */
public interface UserService {
    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    User saveUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void removeUser(Long id);

    /**
     * 删除列表里面的用户
     * @param users
     */
    void removeUsersInBatch(List<User> users);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    User updateUser(User user);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 根据用户名密码获取用户
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 获取用户列表
     *
     * @return
     */
    List<User> listUsers();

    /**
     * 根据用户名进行分页模糊查询
     *
     * @param name
     * @return
     */
    Page<User> listUsersByNameLike(String name, Pageable pageable);

    /**
     * 更具名称列表查询
     *
     * @param usernames
     * @return
     */
    List<User> listUsersByUsernames(Collection<String> usernames);
}
