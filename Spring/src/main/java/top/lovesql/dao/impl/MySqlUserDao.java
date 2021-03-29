package top.lovesql.dao.impl;

import top.lovesql.dao.UserDao;
import top.lovesql.entity.SysUser;

/**
 * @author GuyCui
 * @date 2021/3/29
 * @apiNote
 */
public class MySqlUserDao implements UserDao {
    /**
     * Insert user *
     * @param user user
     */
    @Override
    public void insertUser(SysUser user) {
        System.out.println(user + " 执行了数据库的 insert 操作");
    }
}
