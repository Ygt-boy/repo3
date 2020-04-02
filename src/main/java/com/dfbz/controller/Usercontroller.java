package com.dfbz.controller;

import com.dfbz.po.User;
import com.dfbz.service.Imp.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Usercontroller {

    @Autowired
    private ServiceImp serviceImp;


    @RequestMapping("findall.do")
    public @ResponseBody List<User> findall(){
        System.out.println(111);
        System.out.println(222);
        return serviceImp.findAll();
    }

    @RequestMapping("findone.do")
    public @ResponseBody User findone(int id){
        return serviceImp.findUserById(id);
    }

    @RequestMapping(value = "update.do")
    public @ResponseBody void updateUser(@RequestBody User u){
        this.serviceImp.updateUser(u);
    }

}
