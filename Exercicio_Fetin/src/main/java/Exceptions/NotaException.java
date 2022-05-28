package Exceptions;

public class NotaException extends RuntimeException{ //EXCEÇAO UNCHECKED, HERDA DE RUTIMEEXCEPTION(TEMPO REAL)

    public NotaException(String message){
        super(message);
    }
}
