package entities;

public class P_Verduleria extends Producto{

    String uventa;

    public P_Verduleria(String nombre, Integer precio, String uventa){
        super(nombre,precio);
        this.uventa = uventa;
    }

    public String getUventa() {
        return uventa;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " +
                "Precio $:" + precio +  "/// " +
                "Unidad de Venta: " + uventa;
    }
}
