package top.lovesql.service.impl;


import top.lovesql.dao.UserDao;
import top.lovesql.entity.SysUser;
import top.lovesql.service.UserSerivce;

/**
 * @author GuyCui
 * @date 2021/3/29
 * @apiNote
 */
public class UserSerivceImpl implements UserSerivce {

    private  UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * Add user *
     * @param user user
     */
    @Override
    public void addUser(SysUser user) {
        userDao.insertUser(user);
    }
}
