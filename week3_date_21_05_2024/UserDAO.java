package com.example.dao;

import com.example.model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDAO {

    private final HibernateTemplate hibernateTemplate;

    public UserDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }

    public User getUserById(Long id) {
        return hibernateTemplate.get(User.class, id);
    }

    public void updateUser(User user) {
        hibernateTemplate.update(user);
    }

    public void deleteUser(User user) {
        hibernateTemplate.delete(user);
    }

    public List<User> getAllUsers() {
        return hibernateTemplate.loadAll(User.class);
    }
}

