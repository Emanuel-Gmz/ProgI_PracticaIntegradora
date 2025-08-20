package model;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamos {
    private Libros libros;
    private Usuarios usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

  public Prestamos(Libros libros, Usuarios usuario) {
    this.libros = libros;
    this.usuario = usuario;
    this.fechaPrestamo = LocalDate.now();
  }

  public Libros getLibros() {
    return libros;
  }

  public void setLibros(Libros libros) {
    this.libros = libros;
  }

  public Usuarios getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuarios usuario) {
    this.usuario = usuario;
  }

  public LocalDate getFechaPrestamo() {
    return fechaPrestamo;
  }

  public void setFechaPrestamo(LocalDate fechaPrestamo) {
    this.fechaPrestamo = fechaPrestamo;
  }

  public LocalDate getFechaDevolucion() {
    return fechaDevolucion;
  }

  public void setFechaDevolucion(LocalDate fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Prestamos prestamos = (Prestamos) o;
    return Objects.equals(libros, prestamos.libros) && Objects.equals(usuario, prestamos.usuario) && Objects.equals(fechaPrestamo, prestamos.fechaPrestamo) && Objects.equals(fechaDevolucion, prestamos.fechaDevolucion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libros, usuario, fechaPrestamo, fechaDevolucion);
  }
  @Override
  public String toString() {
    return "Préstamo Libro=" + libros.getTitulo() +
        ", Usuario=" + usuario.getNombre() +
        ", Fecha=" + fechaPrestamo;
  }

}
