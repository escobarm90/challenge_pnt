package Repository;

import entities.Producto;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Repository implements Comparable<Producto> {

    List<Producto> lista = new ArrayList();

    public void guardarProductoEntity(Producto... producto) {
        for (Producto item : producto) {
            lista.add(item);
        }
    }

    public void leerdb() {
        for (Producto item : lista) {
            System.out.println(item);
            ;
        }
    }

    public void comparar() {
        Integer valor = 0;
        Producto productoMayor = null;
        Producto productoMenor = null;
        for (Producto item : lista) {
            if (compareTo(item) < 0) {
                valor = item.getPrecio();
                productoMayor = item;
            }
        }
            for (Producto item2 : lista) {
                if (compareTo(item2) > 0) {
                    valor = item2.getPrecio();
                    productoMenor = item2;
                }
            }
            System.out.println("productoMayor = " + productoMayor.getNombre());
            System.out.println("productoMenor = " + productoMenor.getNombre());
        }


    @Override
    public int compareTo(Producto o) {
        int x = 0;
        /*if(valor < o.getPrecio()){
            return -1;
        }
        if(valor> o.getPrecio()){
            return 1;
        }*/
        return (x < o.getPrecio()) ? -1 : ((x == o.getPrecio()) ? 0 : 1);
    }
}

