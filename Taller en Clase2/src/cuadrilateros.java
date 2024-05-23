public class cuadrilateros extends FigurasGeometricas{
    Double largo;
    Double altura;
    public cuadrilateros(Double largo, Double altura){}
    public cuadrilateros(){}

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    //Metodo
    public double calcularArea(){
        return largo * altura;
    }
    public double calcularPerimetro(){
        return largo + altura;
    }
}
