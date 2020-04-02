package com.dfbz.service;

import com.dfbz.po.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserService {


    List<User> findAll();

    User findUserById(int id);

    void updateUser(User user);

}
