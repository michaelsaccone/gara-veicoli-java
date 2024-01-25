import logic.Gara;
import exceptions.InvalidGaraParameters;
import logic.Database;
import models.Pista;
import models.Veicolo;

public class App {
    public static void main(String[] args) {
        try {
            Gara gara = new Gara(10, Database.PISTE[1]);
            gara.start();
        } catch (InvalidGaraParameters e) {
            e.printStackTrace();
            System.out.println("Si è verificato un errore:" + e.getMessage());
        }
        
    }

    

}
