package model;

public class LibroNoDisponibleException extends RuntimeException {
    public LibroNoDisponibleException(String message) {
        super(message);
    }
}
