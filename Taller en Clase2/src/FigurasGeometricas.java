public class FigurasGeometricas {
    String nombre;
    int nLados;
    public FigurasGeometricas(String Nombre, int nLados) {}
    public FigurasGeometricas() {}

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setNLados(int nLados) {
        this.nLados=nLados;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNLados(){
        return nLados;
    }

}