public class Higiene_producto extends Productos{

    private Double contenido;
    private Integer precio;

    Higiene_producto(String nombre, Double contenido, Integer precio){
        super(nombre);
        this.contenido = contenido;
        this.precio = precio;
    }

    public Double getContenido() {
        return contenido;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setContenido(Double contenido) {
        this.contenido = contenido;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " /// " +
                "Litros: " + contenido +
                "ml" +
                " /// " +
                "Precio: $" + precio
                ;
    }
}
