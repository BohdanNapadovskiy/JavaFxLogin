package org.example.erp.dao;

import org.example.erp.domain.directory.users.User;

public interface UserDao extends Dao<User, Long> {

    static UserDao create() {
        return new UserDaoImpl();

    }

    Boolean existByUserNameAndPassword(String userName, String password);

}
