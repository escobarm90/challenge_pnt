import java.util.*;

public class Main {
    public static void main(String[] args) {
        Productos producto = new Almacen_producto("Coca-Cola Zero", 1.5, 20);
        Productos producto2 = new Almacen_producto("Coca-Cola", 1.5, 18);
        Productos producto3 = new Higiene_producto("Shampoo Sedal", 500, 19);
        Productos producto4 = new Verduleria_producto("Frutillas", 64, "kilo");
        ArrayList<Productos> lista = new ArrayList<Productos>();


        AniadirProductos.aniadirProducto(lista,producto);
        AniadirProductos.aniadirProducto(lista,producto2);
        AniadirProductos.aniadirProducto(lista,producto3);
        AniadirProductos.aniadirProducto(lista,producto4);



        for (Productos item: lista) {
            System.out.println(item.toString());

        }


    }
}
