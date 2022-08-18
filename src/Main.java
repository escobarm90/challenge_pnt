import Repository.Repository;
import entities.P_Almacen;
import entities.P_Perfumeria;
import entities.P_Verduleria;
import entities.Producto;

public class Main {
    public static void main(String[] args) {

        Repository repositorio = new Repository();
        Producto producto = new P_Almacen("Coca-Cola zero",1.5,20);
        Producto producto2 = new P_Almacen("Coca",1.5,18);
        Producto producto3 = new P_Perfumeria("Shampoo Sedal",500,19);
        Producto producto4 = new P_Verduleria("Frutillas",54,"Kilos");

        repositorio.guardarProductoEntity(producto, producto2,producto3,producto4);


        repositorio.leerdb();


        repositorio.comparar();




    }
}
