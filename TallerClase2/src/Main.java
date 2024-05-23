import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Bienvenido al Registro de Estudiantes ---");
            System.out.println("1. Registrar un Estudiante");
            System.out.println("2. Salir");
            System.out.print("Ingrese el número de la opción deseada:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        datosDelEstudiante();
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        } while (opcion != 2);
    }

    private static void datosDelEstudiante() {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la altura (metros) del estudiante:");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la cedula del estudiante:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        estudiante1 estudiante = new estudiante1(nombre, apellido, altura, cedula, edad, 9, 9, 9, 9, 9);
        estudiante.mostrarInformacion();
    }
}