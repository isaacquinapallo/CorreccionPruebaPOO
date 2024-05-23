public class Canciones {
    String nombre;
    String artista;
    String genero;
    Double duracion;
    String plataforma;
    Boolean copyright;
    Double precio;
    public Canciones() {}
    public Canciones(String nombre, String artista, String genero, Double duracion, String plataforma, Boolean copyright, Double precio) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.plataforma = plataforma;
        this.copyright = copyright;
        this.precio = precio;
    }
}
