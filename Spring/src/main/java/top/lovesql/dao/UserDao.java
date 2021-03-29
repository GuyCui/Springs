package top.lovesql.dao;

import top.lovesql.entity.SysUser;

/**
 * User dao
 * @author GuyCui
 * @date 2021 /3/29
 * @apiNote
 */
public interface UserDao {
    /**
     * Insert user *
     * @param user user
     */
    void  insertUser(SysUser user);
}
