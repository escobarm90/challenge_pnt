package repository;

import entities.Productos;

import java.util.ArrayList;

public class ProductosRepository {

    static ArrayList<Productos> lista = new ArrayList<Productos>();

    public static void aniadirProducto(Productos producto) {
        lista.add(producto);
    }
    public static void leerDB(){
    for (Productos item: lista) {
        System.out.println(item.toString());
        }
    }


}
