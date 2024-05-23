public class Instrumentos_Musicales {
    String categoria;
    String nombre;
    String material;
    Double precio;
    Double tamanio;
    //Constructor
    public Instrumentos_Musicales() {}
    public Instrumentos_Musicales(String categoria, String nombre, String material, Double precio, Double tamanio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
        this.tamanio = tamanio;
    }
    //Metodos personalizados
    public void sonar(){
        //aqui funcion que permite sonar el instrumento musical
        System.out.printf("El sonido es...");
    }
    public Boolean entretener(){
        //una funcion que me permite saber si entretiene o no
        return true;
    }
    //Metodos setter y getters

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }
}

