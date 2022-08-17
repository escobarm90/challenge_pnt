public class Almacen_producto extends Productos{

    private Double litros;
    private Integer precio;

    Almacen_producto(String nombre, Double litros, Integer precio){
        super(nombre);
        this.litros = litros;
        this.precio = precio;
    }

    public Double getLitros() {
        return litros;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros +
                "ml" +
                " /// " +
                "Precio: $" + precio
                ;
    }

}
