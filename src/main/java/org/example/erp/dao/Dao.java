package org.example.erp.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    void save(T t);

    void deleteById(ID id);
}
