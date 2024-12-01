package org.example.fitjourney.model;

public class Plan {
    private int codPlan;
    private String nomPlan;
    private int precio;

    public Plan() {
    }

    public Plan(int codPlan, String nomPlan, int precio) {
        this.codPlan = codPlan;
        this.nomPlan = nomPlan;
        this.precio = precio;
    }

    public int getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(int codPlan) {
        this.codPlan = codPlan;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "codPlan=" + codPlan +
                ", nomPlan='" + nomPlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}
