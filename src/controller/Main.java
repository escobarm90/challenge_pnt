package controller;

import entities.Almacen_producto;
import entities.Higiene_producto;
import entities.Productos;
import entities.Verduleria_producto;
import repository.ProductosRepository;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Productos producto = new Almacen_producto("Coca-Cola Zero", 1.5, 20);
        Productos producto2 = new Almacen_producto("Coca-Cola", 1.5, 18);
        Productos producto3 = new Higiene_producto("Shampoo Sedal", 500, 19);
        Productos producto4 = new Verduleria_producto("Frutillas", 64, "kilo");



        ProductosRepository.aniadirProducto(producto);
        ProductosRepository.aniadirProducto(producto2);
        ProductosRepository.aniadirProducto(producto3);
        ProductosRepository.aniadirProducto(producto4);


        ProductosRepository.leerDB();


    }
}
