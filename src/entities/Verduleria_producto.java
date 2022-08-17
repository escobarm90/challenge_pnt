package entities;

import entities.Productos;

public class Verduleria_producto extends Productos {

    private Integer precio;
    private String unidad_de_venta;


    public Verduleria_producto(String nombre, Integer precio, String unidad_de_venta) {
        super(nombre);
        this.unidad_de_venta = unidad_de_venta;
        this.precio= precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getUnidad_de_venta() {
        return unidad_de_venta;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setUnidad_de_venta(String unidad_de_venta) {
        this.unidad_de_venta = unidad_de_venta;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                " /// Precio :$" + getPrecio() + " /// " +
                "Unidad de venta: " + getUnidad_de_venta()
                ;
    }

}






