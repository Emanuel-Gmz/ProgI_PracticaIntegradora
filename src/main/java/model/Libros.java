package model;

import java.util.*;

public class Libros implements Prestable,Reservable {
  private String isbn;
  private String titulo;
  private String autor;
  private String categoria;
  private boolean disponible;
  private Queue<Usuarios> listaEspera;

  public Libros(String isbn, String titulo, String autor, String categoria) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.categoria = categoria;
    this.disponible = true;
    this.listaEspera = new LinkedList<>();
  }

  public String getIsbn() { return isbn; }
  public String getTitulo() { return titulo; }
  public String getCategoria() { return categoria; }

  @Override
  public void prestar(Usuarios usuario) throws LibroNoDisponibleException {
    if (!disponible) {
      throw new LibroNoDisponibleException("El libro " + titulo + " no esta disponible.");
    }
    disponible = false;
    Prestamos prestamo = new Prestamos(this, usuario  );
    usuario.agregarPrestamo(prestamo);
    System.out.println("Prestado: " + prestamo);
  }


  @Override
  public void devolver() {
    disponible = true;
    System.out.println("Libro devuelto: " + titulo);
    if (!listaEspera.isEmpty()) {
      Usuarios siguiente = listaEspera.poll();
      try {
        prestar(siguiente);
      } catch (LibroNoDisponibleException e) {
        System.out.println("Libro No disponible: " + e.getMessage());
      }
    }
  }

  @Override
  public void reservar(Usuarios usuario) {
    listaEspera.add(usuario);
    System.out.println(usuario.getNombre() + " ha reservado el libro: " + titulo);
  }

  @Override
  public String toString() {
    return "Libros{" +
        "ISBN='" + isbn + '\'' +
        ", Titulo='" + titulo + '\'' +
        ", Autor='" + autor + '\'' +
        ", Categoria='" + categoria + '\'' +
        ", Disponible=" + disponible;
  }
}
