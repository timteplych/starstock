package ru.ttv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.ttv.entity.User;
import ru.ttv.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM USER";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
