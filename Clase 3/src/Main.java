import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Instrumentos_Musicales ukulele=new Instrumentos_Musicales(
                "cuerdas","ukulele","caoba",100.0,75.0);

        Instrumentos_Musicales violin=new Instrumentos_Musicales();
        //

        //ukelele.sonar();
        //ukulele.entretener();
        //violin.sonar();
        //violin.entretener();

        System.out.println(ukulele.getCategoria());
        System.out.println(ukulele.getNombre());

        System.out.println(violin.getCategoria());
        System.out.println(violin.getNombre());

        violin.setCategoria("cuerdas");
        violin.setNombre("afonico");

        Scanner entrada=new Scanner(System.in);
        String cuerdas= entrada.nextLine();

        System.out.println(violin.getCategoria());
        System.out.println(violin.getNombre());

        //
        Deportes tenis=new Deportes(
            "tenis",2, false,true,1.30
        );
        Canciones raquel=new Canciones(
                "Raquel","Chava Salazar","Bachata",10.5,"Spotify",true,5.2
        );
    }
}