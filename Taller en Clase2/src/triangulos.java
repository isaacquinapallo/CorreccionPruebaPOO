public class triangulos extends FigurasGeometricas{
    Double base;
    Double altura;
    public triangulos(Double base, Double altura) {}
    public triangulos() {}

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    //Metodo
    public double calcularArea() {
        return base*altura;
    }
    public double calcularPerimetro() {
        return 2*base+2*altura;
    }
}
