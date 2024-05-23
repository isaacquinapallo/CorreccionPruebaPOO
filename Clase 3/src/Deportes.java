public class Deportes {
    String nombre;
    int jugadores;
    Boolean asociado;
    Boolean olimpico;
    Double duracion;
    //Constructor
    public Deportes() {}
    public Deportes(String nombre, int jugadores, Boolean asociado, Boolean olimpico, Double duracion) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.asociado = asociado;
        this.olimpico = olimpico;
        this.duracion = duracion;
    }
}
