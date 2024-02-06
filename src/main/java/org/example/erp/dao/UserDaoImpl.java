package org.example.erp.dao;

import jakarta.persistence.NamedQuery;
import org.example.erp.domain.directory.users.User;
import org.example.erp.util.PersistenceManager;
import org.hibernate.HibernateException;


import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {


    @Override
    public Boolean existByUserNameAndPassword(String userName, String password) {
        boolean result = false;
        try  {
            var entityManager = PersistenceManager.entityManager();
            List users = entityManager
                    .createNamedQuery("Users.findAll")
//                    .setParameter("name", "%" + userName.toLowerCase() + "%")
//                    .setParameter("name", "%" + password + "%")
                    .getResultList();
            int a=1;
        } catch (HibernateException e) {

        }
        return result;
    }


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

}
