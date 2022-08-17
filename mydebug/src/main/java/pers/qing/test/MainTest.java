package pers.qing.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.qing.pojo.User;

/**
 * author       : dezys
 * create date  : 2022/8/17  18:51
 * description  :
 */


public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user);
    }

}
