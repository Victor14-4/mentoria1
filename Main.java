import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("digite a temperatura:");
        double celsius = scanner.nextDouble();
        //
        double fahrenheit = (celsius*9/5)+32;
        double kelvin = celsius+273.15;
        //imprimir
        System.out.println("/Resultados da conversão:");
        System.out.println("temperatura em Celsius:"+celsius+"C");
        System.out.println("Temperatura em Fahrenheit:"+fahrenheit+"F");
        System.out.println("Temperatura em Kelvin;"+kelvin+"K");
        //
        scanner.close();

    }
}