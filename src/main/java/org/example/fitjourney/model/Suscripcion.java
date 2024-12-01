package org.example.fitjourney.model;

public class Suscripcion {
    private int codCuenta;
    private String nomCuenta;
    private int codPlan;
    private int idUsuario;

    public Suscripcion() {
    }

    public Suscripcion(int codCuenta, String nomCuenta, int codPlan, int idUsuario) {
        this.codCuenta = codCuenta;
        this.nomCuenta = nomCuenta;
        this.codPlan = codPlan;
        this.idUsuario = idUsuario;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getNomCuenta() {
        return nomCuenta;
    }

    public void setNomCuenta(String nomCuenta) {
        this.nomCuenta = nomCuenta;
    }

    public int getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(int codPlan) {
        this.codPlan = codPlan;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "codCuenta=" + codCuenta +
                ", nomCuenta='" + nomCuenta + '\'' +
                ", codPlan=" + codPlan +
                ", idUsuario=" + idUsuario +
                '}';
    }
}
