package entities;

public class P_Almacen extends Producto {

    Double litros;



    public P_Almacen(String nombre, Double litros, Integer precio){
        super(nombre, precio);
        this.litros = litros;
            }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " /// " +
                "Contenido:" + litros + "ml /// " +
                "precio: $" + precio;
    }
}
