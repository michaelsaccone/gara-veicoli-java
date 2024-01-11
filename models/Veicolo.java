package models;

public class Veicolo {
    private String name;
    private double velocita;
    private String colore;
    private double accelerazione;

    public Veicolo(String name, String colore) {
        this.name = name;
        this.colore = colore;
    }

    public Veicolo(String name, String colore, double velocita, double accelerazione) {
        this.name = name; 
        this.colore = colore;
        this.velocita = velocita;
        this.accelerazione = accelerazione;
    }

    public String getName() {
        return name;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public String getColore() {
        return colore;
    }

    public double getAccelerazione() {
        return accelerazione;
    }

    public void setAccelerazione(double accelerazione) {
        this.accelerazione = accelerazione;
    }
}
