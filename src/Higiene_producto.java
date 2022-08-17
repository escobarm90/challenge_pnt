public class Higiene_producto extends Productos{

    private Integer contenido;
    private Integer precio;

    Higiene_producto(String nombre, Integer contenido, Integer precio){
        super(nombre);
        this.contenido = contenido;
        this.precio = precio;
    }

    public Integer getContenido() {
        return contenido;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido +
                "ml" +
                " /// " +
                "Precio: $" + precio
                ;
    }
}
