package exceptions;

public class PistaNotFoundException extends Exception{
 
    public PistaNotFoundException() {
        super("Giocatore non trovato");
    }

    public PistaNotFoundException(String message) {
        super(message);
    }
}
