package models;

public class Pista {
    private String name;
    private double lunghezza;
    private double coeffAttrito; // riduzione accelerazione per il terreno

    public Pista(String name, double coeffAttrito, double lunghezza) {
        this.name = name; 
        this.coeffAttrito = coeffAttrito;
        this.lunghezza = lunghezza;
    }

    public double getCoeffAttrito() {
        return coeffAttrito;
    }

    public String getName() {
        return name;
    }

    public double getLunghezza() {
        return lunghezza;
    }
}
