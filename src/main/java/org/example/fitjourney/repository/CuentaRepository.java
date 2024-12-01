package org.example.fitjourney.repository;

import org.example.fitjourney.model.Cuenta;
import org.example.fitjourney.util.DatabaseConnection;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CuentaRepository implements Repository<Cuenta>{

    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getIntance();
    }

    @Override
    public List<Cuenta> findAll() throws SQLException {
        List<Cuenta> cuenta = new ArrayList<>();
        try (Statement myStant = getConnection().createStatement();
             ResultSet myRes = myStant.executeQuery("SELECT * FROM cuenta")) {
            while (myRes.next()) {
                Cuenta e = crearCuenta(myRes);
                cuenta.add(e);
            }
        }
        return cuenta;
    }

    @Override
    public Cuenta getById(int codCuenta) throws SQLException {
        Cuenta cuenta = null;
        try(PreparedStatement myStant = getConnection().prepareStatement("SELECT * FROM cuenta WHERE codCuenta = ?")){
            myStant.setInt(1, codCuenta);
            try(ResultSet myRes = myStant.executeQuery()){
                if (myRes.next()) {
                    cuenta = crearCuenta(myRes);
                }
            }
        }
        return cuenta;
    }

    @Override
    public void guardar(Cuenta cuenta) {

    }

    @Override
    public void borrar(int id) {

    }

    private Cuenta crearCuenta(ResultSet myRes) throws SQLException {
        Cuenta e = new Cuenta();
        e.setNombreCuenta(myRes.getString("nombreCuenta"));
        e.setCodPlan(myRes.getInt("codPlan"));
        e.setIdUsuario(myRes.getInt("idUsuario"));
        return e;
    }
}
