public class Verduleria_producto extends Productos{

    private Integer precio;
    private String unidad_de_venta;


    Verduleria_producto(String nombre, Integer precio, String unidad_de_venta){
        super(nombre);
        this.unidad_de_venta = unidad_de_venta;
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getUnidad_de_venta() {
        return unidad_de_venta;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setUnidad_de_venta(String unidad_de_venta) {
        this.unidad_de_venta = unidad_de_venta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " /// Precio :$" + precio + " /// " +
                "Unidad de venta: $" + unidad_de_venta
                ;
    }
}






