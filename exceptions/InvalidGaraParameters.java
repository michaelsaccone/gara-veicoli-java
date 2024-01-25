package exceptions;

public class InvalidGaraParameters extends Exception{
    public InvalidGaraParameters(String message) {
        super("Parametri di inizializzazione della gara non validi: " + message);
    }
}
