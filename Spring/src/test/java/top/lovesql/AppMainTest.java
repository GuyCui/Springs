package top.lovesql;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lovesql.entity.Student;
import top.lovesql.entity.SysUser;
import top.lovesql.service.SomeService;
import top.lovesql.service.impl.UserSerivceImpl;

import java.util.Arrays;

/**
 * @author GuyCui
 * @date 2021/3/28
 * @apiNote
 */
public class AppMainTest {

    /**
     * Spring 是在什么时候创建的对象?
     * 创建Spring 容器(ApplicationContext)对象的时候,会读取配置文件,创建文件中声明的 Java 对象.
     *
     * 优点:
     *  获取对象的速度块,对象已经提前创建好了.
     *
     * 缺点:
     *  占用内存,会创建xml 中所有的 bean 对象.
     */
    @Test
    public void testSpring() {
        String config = "bean.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        SomeService bean = appContext.getBean(SomeService.class);
        bean.someMethod();
    }

    /**
     * 获取容器(ApplicationContext)中对象的信息
     */
    @Test
    public void springInfo() {
        String config = "bean.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);

        // 获取 Spring 容器中定义对象的数量
        int definitionCount = appContext.getBeanDefinitionCount();
        System.out.println("容器中定义对象的数量 == " + definitionCount);

        // 获取 Spring 对象中定义对象名称
        String[] definitionNames = appContext.getBeanDefinitionNames();
        System.out.println("容器中对象的名称 == " + Arrays.toString(definitionNames));

    }

    /**
     *
     */
    @Test
    public void testStudent() {
        String config = "application/applicationContext.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        Student bean = (Student) appContext.getBean("myType");
        System.out.println(bean);
    }

    @Test
    public void myUserTest() {
        String config = "user/applicationContext.xml";

        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);

        UserSerivceImpl userSerivce = appContext.getBean(UserSerivceImpl.class);
        
        SysUser sysUser = new SysUser();
        sysUser.setAge(22);
        sysUser.setName("王五");
        userSerivce.addUser(sysUser);

    }
}
