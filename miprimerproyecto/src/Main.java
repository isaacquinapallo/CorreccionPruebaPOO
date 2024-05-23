import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.println("--------CALCULADORA DE IMC--------\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura: ");
        float altura = sc.nextFloat();
        System.out.println("Ingrese el peso: ");
        float peso = sc.nextFloat();
        System.out.println("el IMC es: ");
        float imc = peso/(altura*altura);
        System.out.println(imc);
        if (imc < 16.5){
            System.out.println("BAJO PESO SEVERO" );
        }else if (imc >= 16.5 && imc < 18.5){
            System.out.println("BAJO " );
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("PESO NORMAL" );
        }else if (imc >= 25 && imc < 30){
            System.out.println("SOBREPESO " );
        }else if (imc >= 30 && imc < 35){
            System.out.println("OBESIDAD TIPO 1 (moderada)" );
        }else if (imc >= 35 && imc < 40){
            System.out.println("OBESIDAD TIPO 1 (severa)" );
        }else if (imc >= 40){
            System.out.println("OBESIDAD TIPO 3 (morbida) " );
        }


    }
}