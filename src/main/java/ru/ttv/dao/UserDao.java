package ru.ttv.dao;

import ru.ttv.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
