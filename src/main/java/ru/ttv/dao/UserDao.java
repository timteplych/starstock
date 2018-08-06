package ru.ttv.dao;

import ru.ttv.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    User getById(int id);
    void update (User user);
    List<User> findAll();
    void delete(int id);
}
