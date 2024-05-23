public class estudiante1 {
    private String nombre;
    private String apellido;
    private double altura;
    private String cedula;
    private int edad;
    private float analisisDeDatos;
    private float basesDeDatos;
    private float diseñoDeInterfaces;
    private float gestionDeProyectosDeSoftware;
    private float programacionOrientadaAObjetos;

    public estudiante1(String nombre, String apellido, double altura, String cedula, int edad, float analisisDeDatos, float basesDeDatos, float diseñoDeInterfaces, float gestionDeProyectosDeSoftware, float programacionOrientadaAObjetos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.cedula = cedula;
        this.edad = edad;
        this.analisisDeDatos = analisisDeDatos;
        this.basesDeDatos = basesDeDatos;
        this.diseñoDeInterfaces = diseñoDeInterfaces;
        this.gestionDeProyectosDeSoftware = gestionDeProyectosDeSoftware;
        this.programacionOrientadaAObjetos = programacionOrientadaAObjetos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Altura: " + altura);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);

        System.out.println("Calificaciones(En base 10)-------------------------");
        System.out.println("Analisis De Datos: " + analisisDeDatos);
        System.out.println("Bases De Datos: " + basesDeDatos);
        System.out.println("Diseño De Interfaces: " + diseñoDeInterfaces);
        System.out.println("Gestion De Proyectos De Software: " + gestionDeProyectosDeSoftware);
        System.out.println("Programacion Orientada A Objetos: " + programacionOrientadaAObjetos);

        float promedio = (analisisDeDatos + basesDeDatos + diseñoDeInterfaces + gestionDeProyectosDeSoftware + programacionOrientadaAObjetos) / 5;
        System.out.println("Promedio: " + promedio);
        System.out.println("Numero maximo: " + Math.max(Math.max(Math.max(analisisDeDatos, basesDeDatos), diseñoDeInterfaces), Math.max(gestionDeProyectosDeSoftware, programacionOrientadaAObjetos)));
        System.out.println("Numero minimo: " + Math.min(Math.min(Math.min(analisisDeDatos, basesDeDatos), diseñoDeInterfaces), Math.min(gestionDeProyectosDeSoftware, programacionOrientadaAObjetos)));
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getAnalisisDeDatos() {
        return analisisDeDatos;
    }
    public void setAnalisisDeDatos(float analisisDeDatos) {
        this.analisisDeDatos = analisisDeDatos;
    }
    public float getBasesDeDatos() {
        return basesDeDatos;
    }
    public void setBasesDeDatos(float basesDeDatos) {
        this.basesDeDatos = basesDeDatos;
    }
    public float getDiseñoDeInterfaces() {
        return diseñoDeInterfaces;
    }
    public void setDiseñoDeInterfaces(float diseñoDeInterfaces) {
        this.diseñoDeInterfaces = diseñoDeInterfaces;
    }
    public float getGestionDeProyectosDeSoftware() {
        return gestionDeProyectosDeSoftware;
    }
    public void setGestionDeProyectosDeSoftware(float gestionDeProyectosDeSoftware) {
        this.gestionDeProyectosDeSoftware = gestionDeProyectosDeSoftware;
    }
    public float getProgramacionOrientadaAObjetos() {
        return programacionOrientadaAObjetos;
    }
    public void setProgramacionOrientadaAObjetos(float programacionOrientadaAObjetos) {
        this.programacionOrientadaAObjetos = programacionOrientadaAObjetos;
    }
}

