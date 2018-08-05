package ru.ttv.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ttv.dao.UserDao;
import ru.ttv.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
