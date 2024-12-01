package org.example.fitjourney.main;
import org.example.fitjourney.repository.CuentaRepository;
import org.example.fitjourney.repository.Repository;
import org.example.fitjourney.util.DatabaseConnection;
import org.example.fitjourney.model.Cuenta;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        try(Connection myConn = DatabaseConnection.getIntance();) {
            Repository<Cuenta> repository = new CuentaRepository();
            repository.findAll().forEach(System.out::println);
        }

    }
}