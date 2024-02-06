package org.example.erp.service;

import org.example.erp.dao.UserDao;
import org.example.erp.domain.directory.users.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    static UserService create(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }

    Boolean existByUserNameAndPassword(String userName, String password);

    List<User> findAll();

    Optional<User> findById(Long id);

    void save(User user);

    void deleteById(Long id);
}
