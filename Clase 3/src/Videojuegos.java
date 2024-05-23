public class Videojuegos {
    String nombre;
    Double precio;
    String categoria;
    String descripcion;
    float calificacion;
    //Constructor
    public Videojuegos() {}

    public Videojuegos(String nombre, Double precio, String categoria, String descripcion, float calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
}
