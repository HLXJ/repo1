package com.lagou.test;

import com.lagou.dao.IUserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {

    @Test
    public void testSave(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
