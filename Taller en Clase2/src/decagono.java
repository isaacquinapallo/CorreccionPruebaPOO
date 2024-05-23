public class decagono extends FigurasGeometricas {
    Double longitudLado;
    Double apotema;

    public decagono(Double longitudLado, Double apotema) {}
    public decagono() {}

    public Double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(Double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    //Metodos
    public Double calcularPerimetro() {
        return longitudLado*10;
    }
    public Double calcularArea() {
        return (calcularPerimetro()*apotema)/2;
    }

}
