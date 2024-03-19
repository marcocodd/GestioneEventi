package marco.exceptions;


public class NotFoundExc extends RuntimeException {
    public NotFoundExc(long idEvent) {
        super("L'Evento con l'id: " + idEvent + " non è stato trovato!");
    }
}

