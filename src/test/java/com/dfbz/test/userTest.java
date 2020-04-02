package com.dfbz.test;

import com.dfbz.po.User;
import com.dfbz.service.Imp.ServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class userTest {

    @Autowired
    private ServiceImp serviceImp;

    @Test
    public void testFindAll(){
        List<User> list = serviceImp.findAll();
        System.out.println(list);
    }
    @Test
    public void testFindById(){
        User u = serviceImp.findUserById(1);
        System.out.println(u);
    }
    @Test
    public void testUpdate(){

    }


}
