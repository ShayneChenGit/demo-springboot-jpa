package jpa.service.impl;

import jpa.dao.UserDao;
import jpa.model.User;
import jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUser() {
        return userDao.findAll();
    }
}
