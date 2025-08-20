package model;

public interface Prestable {
  void prestar(Usuarios usuario) throws LibroNoDisponibleException;
  void devolver();
}
