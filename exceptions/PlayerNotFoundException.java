package exceptions;

public class PlayerNotFoundException extends Exception{
 
    public PlayerNotFoundException() {
        super("Giocatore non trovato");
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
