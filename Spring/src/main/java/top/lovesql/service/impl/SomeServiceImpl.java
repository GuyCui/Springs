package top.lovesql.service.impl;

import top.lovesql.service.SomeService;

/**
 * @author GuyCui
 * @date 2021/3/28
 * @apiNote
 */
public class SomeServiceImpl implements SomeService {
    /**
     * Some method
     */
    @Override
    public void someMethod() {
        System.out.println("执行了业务方法()");
    }
}
