package models;

public class Player {

    private String name;
    private String id;
    private Veicolo veicolo;
    private Upgrade upgrade;

    public Player(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public void setUpgrade(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public Upgrade getUpgrade() {
        return upgrade;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}