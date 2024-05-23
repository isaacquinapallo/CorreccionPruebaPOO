public class Main {
    public static void main(String[] args) {
        FigurasGeometricas mifigura=new FigurasGeometricas();

        nonagono mifigura8= new nonagono();
        decagono mifigura9= new decagono();

        System.out.println("La nueva estatua nonagona ");
        mifigura8.setNombre("Fill");
        System.out.println(mifigura8.getNombre());
        System.out.println(" tendra una longitud de lado de: ");
        mifigura8.setLongitudLado(4.0);
        System.out.println(" tendra un perimetro de: ");
        mifigura8.setApotema(4.0);
        System.out.println(mifigura8.getLongitudLado());
        System.out.println("´y su area será: ");
        System.out.println(mifigura8.calcularArea());
        System.out.println("´y su perimetro será: ");
        System.out.println(mifigura8.calcularPerimetro());

        System.out.println("La nueva estatua decagona ");
        mifigura9.setNombre("Fill");
        System.out.println(mifigura9.getNombre());
        System.out.println(" tendra una longitud de lado de: ");
        mifigura9.setLongitudLado(4.0);
        System.out.println(" tendra un perimetro de: ");
        mifigura9.setApotema(4.0);
        System.out.println(mifigura9.getLongitudLado());
        System.out.println("´y su area será: ");
        System.out.println(mifigura9.calcularArea());
        System.out.println("´y su perimetro será: ");
        System.out.println(mifigura9.calcularPerimetro());
    }

}
