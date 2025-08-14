package org.example;

import model.*;

public class Main {
    public static void main(String[] args) {

        Libros libros1 = new Libros("ABCD123","El Principito","Williams", Categoria.Programación, Estado.PRESTADO);
        Libros libros2 = new Libros("BBBA321","Pedro papas","Williams", Categoria.Matematicas,Estado.DISPONIBLE);

        Usuarios usuario1 = new Usuarios(001,"Williams");


        // Prestamos prestamos1 = new Prestamos(libros1,usuario1,);





    }
}