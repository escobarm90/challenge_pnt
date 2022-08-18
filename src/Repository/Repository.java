package Repository;

import entities.Producto;

import java.util.ArrayList;

import java.util.List;

public class Repository {

    List<Producto> lista = new ArrayList<Producto>();

    public  void guardarProductoEntity(Producto producto){
        lista.add(producto);
    }
}
