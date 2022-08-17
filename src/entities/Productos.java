package entities;

public class Productos{

 protected String nombre;
 protected Integer precio;

    public Productos(String nombre){
        this.nombre = nombre;
       // this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
}
