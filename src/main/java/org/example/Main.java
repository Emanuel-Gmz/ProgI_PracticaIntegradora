package org.example;

import model.*;



public class Main {
  public static void main(String[] args) {
      Biblioteca bibliotecaUni = new Biblioteca();
        Usuarios usuario1 = new Usuarios(1, "Pedro");
        Usuarios usuario2 = new Usuarios(2, "Luis");
        bibliotecaUni.registrarUsuario(usuario1);
        bibliotecaUni.registrarUsuario(usuario2);

        Libros libros1 = new Libros("ABC001", "Java", "Ruppert A", "Programación");
        Libros libros2 = new Libros("DEF002", "Binarios", "Francis C", "Matemáticas");


        bibliotecaUni.registrarLibro(libros1);
        bibliotecaUni.registrarLibro(libros2);

        try {
          libros1.prestar(usuario1);
          libros1.prestar(usuario2);
        } catch (LibroNoDisponibleException e) {
          System.out.println(e.getMessage());
          libros1.reservar(usuario2);
        }

        libros1.devolver();

        System.out.println("\nHistorial de " + usuario1.getNombre() + ":");
        usuario1.getHistorialPrestamos().forEach(System.out::println);

        System.out.println("\nLibros de Matemáticas:");
        bibliotecaUni.mostrarLibrosPorCategoria("Matemáticas");
      }


    }