package top.lovesql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lovesql.service.SomeService;
import top.lovesql.service.impl.SomeServiceImpl;

/**
 * @author GuyCui
 * @date 2021/3/28
 * @apiNote
 */
public class AppMain {
    public static void main(String[] args) {

        // **************************原始方式**************************
        /*SomeService someService = new SomeServiceImpl();
        someService.someMethod();*/

        // **************************Spring 方式**************************

        // 1.指定 Spring 配置文件;从类路径(classPath)之下开始的路径
        String configLocation = "bean.xml";

        // 2.创建储存对象容器,ApplicationContext 表示 Spring 容器对象.通过 applicationContext 获取某个对象.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);

        // 3.从容器中获取指定名称的对象,使用 getBean("id")
        SomeService bean = (SomeService) applicationContext.getBean("someService");
        // 或者使用反射类的方式获取指定对象.
        // SomeService bean = applicationContext.getBean(SomeService.class);

        // 4.调用接口实现类中的方法
        bean.someMethod();
    }
}
