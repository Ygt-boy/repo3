package com.dfbz.service.Imp;

import com.dfbz.dao.Userdao;
import com.dfbz.po.User;
import com.dfbz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImp implements IUserService {

    @Autowired
    private Userdao ud;

    @Override
    public List<User> findAll() {
        return ud.findAll();
    }

    @Override
    public User findUserById(int id) {
        return ud.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        ud.updateUser(user);
    }
}
