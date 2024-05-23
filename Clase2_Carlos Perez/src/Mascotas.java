public class Mascotas {

    String nombre;
    int edad;
    String raza;
    String especie;
    String color;

    public Mascotas() {
    }

    public Mascotas(String especie, String color, String nombre, String raza, int edad) {
        this.especie = especie;
        this.color = color;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void imprimirDatos  () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Especie: " + especie);
        System.out.println("Color: " + color);
        System.out.println("Tamano: " + color);
    }
}
