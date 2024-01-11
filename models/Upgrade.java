package models;

public class Upgrade {
    private String name;
    private double velocitaAggiunta;

    public Upgrade(String name, double velocitaAggiunta) {
        this.name = name;
        this.velocitaAggiunta = velocitaAggiunta;
    }

    public double getVelocitaAggiunta() {
        return this.velocitaAggiunta;
    }
}
