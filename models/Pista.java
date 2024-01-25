package models;

public class Pista {
    private String name;
    private int lunghezza;
    private double coeffAttrito; // riduzione accelerazione per il terreno

    public Pista(String name, double coeffAttrito, int lunghezza) {
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

    public int getLunghezza() {
        return lunghezza;
    }
}
