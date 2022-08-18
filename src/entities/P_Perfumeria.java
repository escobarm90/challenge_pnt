package entities;

public class P_Perfumeria extends Producto{

    Integer contenido;

    public P_Perfumeria(String nombre, Integer contenido, Integer precio){
        super(nombre, precio);
        this.contenido = contenido;
        }

    public Integer getContenido() {
        return contenido;
    }

    public void Contenido(Integer litros) {
        this.contenido= contenido;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " /// " +
                "litros:" + contenido + "ml /// " +
                "precio: $" + precio;
    }
}
