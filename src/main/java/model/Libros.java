package model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Libros {
    private String ISBN;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private Estado estado;

    public Libros(String ISBN,String titulo,String autor,Categoria categoria, Estado estado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.estado = estado;
    }

    Set <Libros> setLibros = new LinkedHashSet<>();

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libros libros = (Libros) o;
        return Objects.equals(ISBN, libros.ISBN) && Objects.equals(titulo, libros.titulo) && Objects.equals(autor, libros.autor) && categoria == libros.categoria && Objects.equals(estado, libros.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo, autor, categoria, estado);
    }

    @Override
    public String toString() {
        return "Libros{" +
                "ISBN='" + ISBN + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Categoria=" + categoria +
                ", Estado=" + estado;
    }
}
