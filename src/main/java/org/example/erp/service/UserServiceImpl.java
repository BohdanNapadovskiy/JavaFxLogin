package org.example.erp.service;

import lombok.RequiredArgsConstructor;
import org.example.erp.dao.UserDao;
import org.example.erp.domain.directory.users.User;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

        @Override
    public Boolean existByUserNameAndPassword(String userName, String password) {
        return userDao.existByUserNameAndPassword(userName, password);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
