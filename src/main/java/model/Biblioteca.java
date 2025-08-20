package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
  private Map<String, Libros> catalogo = new HashMap<>();
  private Map<String, Set<Libros>> librosPorCategoria = new HashMap<>();
  private Set<Usuarios> usuariosRegistrados = new HashSet<>();

  public void registrarLibro(Libros libro) {
    catalogo.put(libro.getIsbn(), libro);
    librosPorCategoria.putIfAbsent(libro.getCategoria(), new HashSet<>());
    librosPorCategoria.get(libro.getCategoria()).add(libro);
  }

  public void registrarUsuario(Usuarios usuario) {
    usuariosRegistrados.add(usuario);
  }

  public void mostrarLibrosPorCategoria(String categoria) {
    librosPorCategoria.getOrDefault(categoria, Set.of()).forEach(System.out::println);
  }
}
