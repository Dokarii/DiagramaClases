package org.example.fitjourney.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{
    List<T> findAll() throws SQLException;

    T getById(int id) throws SQLException;

    void guardar(T t);

    void borrar(int id);
}
