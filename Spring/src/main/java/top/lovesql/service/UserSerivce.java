package top.lovesql.service;

import top.lovesql.entity.SysUser;

/**
 * User serivce
 * @author GuyCui
 * @date 2021 /3/29
 * @apiNote
 */
public interface UserSerivce {

    /**
     * Add user *
     * @param user user
     */
    void addUser(SysUser user);
}
