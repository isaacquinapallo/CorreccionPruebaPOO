public class Persona {
    // Atributos
    String nombre;
    int edad;
    double altura;
    String ojos;
    double peso;
    String Lugar_Nacimiento;

    // Constructor: Metodo que permite inicializar los valores de una clase

    public Persona() {}

    // Metodos

        // setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setLugar_Nacimiento(String lugar_Nacimiento) {
        Lugar_Nacimiento = lugar_Nacimiento;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

        // getters

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public String getOjos() {
        return ojos;
    }

    public double getAltura() {
        return altura;
    }

        // otros metodos

    public double imc () {
        return peso/(altura*altura);
    }

    public void imprimirDatosPersona () {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Lugar de nacimiento: " + this.getLugar_Nacimiento());
        System.out.println("Color de ojos: " + this.getOjos());
        System.out.println("IMC: " + (double)Math.round(imc() * 100d/ 100d));
        System.out.println();
    }
}









