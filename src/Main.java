import entities.P_Almacen;
import entities.P_Perfumeria;
import entities.P_Verduleria;

public class Main {
    public static void main(String[] args) {

        P_Almacen producto = new P_Almacen("Coca-Cola zero",1.5,20);
        P_Almacen producto2 = new P_Almacen("Coca-Cola zero",1.5,20);
        P_Perfumeria producto3 = new P_Perfumeria("Shampoo Sedal",500,19);
        P_Verduleria producto4 = new P_Verduleria("Frutillas",54,"Kilos");



        System.out.println(producto.toString());
        System.out.println(producto2.toString());
        System.out.println(producto3.toString());




    }
}
