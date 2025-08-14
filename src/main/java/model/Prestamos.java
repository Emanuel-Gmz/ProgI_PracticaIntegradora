package model;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamos {
    private Libros libros;
    private Usuarios usuario;
    private LocalDate fecha;

    public Prestamos(Libros libros, Usuarios usuario, LocalDate fecha) {
        this.libros = libros;
        this.usuario = usuario;
        this.fecha = fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamos prestamos = (Prestamos) o;
        return Objects.equals(libros, prestamos.libros) && Objects.equals(usuario, prestamos.usuario) && Objects.equals(fecha, prestamos.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libros, usuario, fecha);
    }




}
