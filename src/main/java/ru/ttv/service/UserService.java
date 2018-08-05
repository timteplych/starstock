package ru.ttv.service;

import ru.ttv.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
