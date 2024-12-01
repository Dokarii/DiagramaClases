package org.example.fitjourney.model;

public class Cuenta {
    private int codCuenta;
    private String nombreCuenta;
    private int codPlan;
    private int idUsuario;

    public Cuenta() {
    }

    public Cuenta(int codCuenta, String nombreCuenta, int codPlan, int idUsuario) {
        this.codCuenta = codCuenta;
        this.nombreCuenta = nombreCuenta;
        this.codPlan = codPlan;
        this.idUsuario = idUsuario;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(int codPlan) {
        this.codPlan = codPlan;
    }

    public int getIdUsuario(int idUsuario) {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Codigo = '" + codCuenta + '\'' +
                ", Nombre de cuenta = '" + nombreCuenta + '\'' +
                ", Código plan= " + codPlan +
                ", Id del usuario= " + idUsuario +
                '}';
    }

}
