public class circulos extends FigurasGeometricas{
    Double radio;
    public circulos(Double radio){}
    public circulos(){}

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
