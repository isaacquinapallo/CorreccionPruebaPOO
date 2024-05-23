import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        persona1.setNombre("Carlos");
        persona1.setAltura(1.64);
        persona1.setPeso(60);
        persona1.setEdad(19);
        persona1.setOjos("Cafes");
        persona1.setLugar_Nacimiento("Quito");

        persona1.imprimirDatosPersona();

        persona2.setNombre("Josue");
        persona2.setAltura(1.73);
        persona2.setPeso(75);
        persona2.setEdad(19);
        persona2.setOjos("Cafes");
        persona2.setLugar_Nacimiento("Quito");

        persona2.imprimirDatosPersona();

        persona3.setNombre("Adrian");
        persona3.setAltura(1.68);
        persona3.setPeso(65);
        persona3.setEdad(20);
        persona3.setOjos("Cafe");
        persona3.setLugar_Nacimiento("Quito");

        persona3.imprimirDatosPersona();

        Mascotas mascota1 = new Mascotas();
        Mascotas mascota2 = new Mascotas();
        Mascotas mascota3 = new Mascotas();

        Scanner sc = new Scanner(System.in);



        System.out.print("Nombre: ");
        mascota1.setNombre(sc.nextLine());
        System.out.print("Edad: ");
        mascota1.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Color: ");
        mascota1.setColor(sc.nextLine());
        System.out.print("Raza: ");
        mascota1.setRaza(sc.nextLine());
        System.out.print("Especie: ");
        mascota1.setEspecie(sc.nextLine());
        System.out.println(" ");

        mascota1.imprimirDatos();





    }
}