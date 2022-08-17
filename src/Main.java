import java.util.*;

public class Main {
    public static void main(String[] args) {
        Productos producto = new Higiene_producto("Sedal", 1.5, 19);
        Productos producto2 = new Higiene_producto("Pantene", 12.5, 39);
        List<Productos> lista = new ArrayList<Productos>();


        lista.add(producto);
        lista.add(producto2);


        for (Productos item: lista) {
            System.out.println(item.toString());

        }


    }
}
