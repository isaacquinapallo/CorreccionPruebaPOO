public class nonagono extends FigurasGeometricas{

    Double longitudLado;
    Double apotema;

    public nonagono(Double longitudLado, Double apotema){}
    public nonagono(){}

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
        return longitudLado*9;
    }
    public Double calcularArea() {
        return (calcularPerimetro()*apotema)/2;
    }

}
