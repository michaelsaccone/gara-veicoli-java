import logic.Gara;

import exceptions.InvalidGaraParameters;
import logic.Database;
import models.Pista;
import models.Veicolo;
import ui.Map;

public class App {
    public static void main(String[] args) {
        try {
            Gara gara = new Gara(10, Database.PISTE[1]);

            gara.generateBots(10);
            Map map = new Map(gara);
            double t = System.currentTimeMillis();
            gara.start();
            do  {
                map.calcMap(t);
                map.draw();
                try {
                    Thread.sleep(250);
                } catch(InterruptedException e) {
                    System.exit(0);
                }
                t = System.currentTimeMillis();
            } while(!gara.isFinished(t));

            // gara.start();

        } catch (InvalidGaraParameters e) {
            e.printStackTrace();
            System.out.println("Si è verificato un errore:" + e.getMessage());
        }
        
    }

    

}
