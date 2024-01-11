package logic;

import java.util.ArrayList;

import models.*;

public class Gara {
    
    private ArrayList<Player> players;
    private Pista pista;
    private double tInizio;
    
    public void addPlayer(Player p) {
        this.players.add(p);
    }


    public Gara(int nPartecipanti, Pista pista) {
        this.players = new ArrayList<>(nPartecipanti);
        this.pista = pista;
    }

    public void start() {
        this.tInizio = System.currentTimeMillis();
    }

    // x = v(*t) + 1/2 * a * t*t
    public double distanzaPercorsa(Player p, double t) {
        double v = (p.getVeicolo().getVelocita());
        if(p.getUpgrade() != null) v += p.getUpgrade().getVelocitaAggiunta();

        double a = p.getVeicolo().getAccelerazione();
        a -= pista.getCoeffAttrito();

        double x = v*t + 0.5 * a * t*t;
        return x;
    }

}
