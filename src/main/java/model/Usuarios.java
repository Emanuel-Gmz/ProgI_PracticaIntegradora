package model;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private int ID;
    private String nombre;
    private List<Prestamos> historialPrestamos;

  public Usuarios(int ID, String nombre) {
    this.ID = ID;
    this.nombre = nombre;
    this.historialPrestamos = new ArrayList<>();
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Prestamos> getHistorialPrestamos() {
    return historialPrestamos;
  }

  public void setHistorialPrestamos(List<Prestamos> historialPrestamos) {
    this.historialPrestamos = historialPrestamos;
  }

  public void agregarPrestamo(Prestamos p) {
    historialPrestamos.add(p);
  }

  @Override
    public String toString() {
        return "== Usuarios ==" +
                "ID=" + ID +
                ", Nombre=" + nombre;
    }
}
