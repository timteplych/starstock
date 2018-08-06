package ru.ttv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.ttv.entity.User;
import ru.ttv.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao{
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO users (username,email,age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new UserMapper(),id);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE users SET username=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge(), user.getId());
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id =?";
        jdbcTemplate.update(sql,id);
    }
}
