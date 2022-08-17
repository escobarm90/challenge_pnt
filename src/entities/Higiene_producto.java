package entities;

import entities.Productos;

public class Higiene_producto extends Productos {

    private Integer contenido;
    private Integer precio;

    public Higiene_producto(String nombre, Integer precio, Integer contenido){
        super(nombre);
        this.contenido = contenido;
        this.precio=precio;
    }

    public String getNombre(){
        return this.nombre;
    }
    public Integer getContenido() {
        return contenido;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() +
                "ml" +
                " /// " +
                "Precio: $" + getPrecio()
                ;
    }



}
