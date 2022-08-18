package entities;

public class Producto implements Comparable<Producto> {

    String nombre;
    Integer precio;

    Producto(String nombre, Integer precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otro) {
            return this.precio.compareTo(otro.precio);
    }

    public String getNombre() {
        return nombre;
    }
}
