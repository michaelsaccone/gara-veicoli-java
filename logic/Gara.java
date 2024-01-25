package logic;

import java.util.ArrayList;
import java.util.Random;

import exceptions.GaraException;
import exceptions.InvalidGaraParameters;
import models.*;

public class Gara {
    
    private ArrayList<Player> players;
    private Pista pista;
    private double tInizio;
    
    public void addPlayer(Player p) {
        this.players.add(p);
    }

    public Gara(int nPartecipanti, Pista pista) throws InvalidGaraParameters {

        if (nPartecipanti <= 0 || null == pista ){
            throw new InvalidGaraParameters("Numeri di partecipati o pista non valida");
        }
        this.players = new ArrayList<>(nPartecipanti);
        this.pista = pista;
    }

    public void start() {
        this.tInizio = System.currentTimeMillis();
    }

    public void generateBots(int n) {
        Random r = new Random();

        for(int i = 0; i < n; i++) {
            Player p = new Player("x", 
                Database.BOT_NAMES[
                    r.nextInt(Database.BOT_NAMES.length)
                ]
            );
            p.setVeicolo(
                Database.VEHICLES[
                    r.nextInt(Database.VEHICLES.length)
                ]
            );

            this.players.add(p);
        }

        
    }

    public int getGiocatoriIscritti() {
        return this.players.size();
    }

    public int getLunghezzaPista() {
        return this.pista.getLunghezza();
    }

    public Player getPlayerAt(int i){
        return this.players.get(i);
    }

    public double getTempo(){
        return this.tInizio;
    }

    public boolean isFinished(double t) {
        double deltaT = (t - this.tInizio) / 1000;
        boolean finished = false;
        for(Player p: this.players) {
            if(distanzaPercorsa(p, deltaT) > this.getLunghezzaPista()) {
                finished = true;
            }
        }
        return finished;
    }

    // x = v(*t) + 1/2 * a * t*t
    public int distanzaPercorsa(Player p, double t) {
        double v = (p.getVeicolo().getVelocita());
        if(p.getUpgrade() != null) v += p.getUpgrade().getVelocitaAggiunta();

        double a = p.getVeicolo().getAccelerazione();
        a -= pista.getCoeffAttrito();

        double x = v*t + 0.5 * a * t*t;
        return (int)Math.floor(x);
    }

}
