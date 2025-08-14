package model;

import java.util.Objects;

public class Usuarios {
    private int ID;
    private String nombre;
    //private String Historial;// Posible array.

    public Usuarios(int ID, String nombre) {
        this.ID ++;
        this.nombre = nombre;
      //  this.titul = titul;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /*public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return ID == usuarios.ID && Objects.equals(nombre, usuarios.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nombre);
    }

    @Override
    public String toString() {
        return "== Usuarios ==" +
                "ID=" + ID +
                ", Nombre=" + nombre;
    }
}
