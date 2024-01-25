package exceptions;

/**
 * GaraException
 */
public class GaraException extends Exception{

    public GaraException(String message) {
        super("Gara non avviabile, errore: " + message);
    }
}