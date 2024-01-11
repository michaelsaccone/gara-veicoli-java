package logic;

import models.Pista;
import models.Upgrade;
import models.Veicolo;

public class Database {

    public static Upgrade[] UPGRADES = {
        new Upgrade("BRONZE", 0.5),
        new Upgrade("SILVER", 0.8),
        new Upgrade("GOLD", 1),
        new Upgrade("DIAMOND", 1.2)
    };

    public static Veicolo[] VEHICLES = {
        new Veicolo("Batmobile", "nero opaco", 3.0, 0.6),
        new Veicolo("Ronzino pelle e ossa", "grigio", 1.0, 1.4),
        new Veicolo("Fennec", "Bianco titanio", 2.3, 0.2),
        new Veicolo("Diacia duster", "Rossa", 3.2, 0.3),
        new Veicolo("KITT", "nera", 2.7, 0.4)
    };

    public static Pista[] PISTE = {
        new Pista("Circuito arcobaleno", 0.32, 50),
        new Pista("Mappa di carnot", 0.2, 50),
        new Pista("Piston cup", 0.12, 65)
    };

    public static String[] BOT_NAMES = {
        "Paolo", "Gigi", "Saetta MCQueen", "Cricchetto",
        "Mr Resetti", "Re Ghiaccio", "Bowser", "King DeDeDe",
        "Arthur Morgan", "Michele Misseri"
    };
    
}
