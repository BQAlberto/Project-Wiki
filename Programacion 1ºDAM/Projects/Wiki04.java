/* 4.Realiza un programa que solicite un número entre 1 y 1000 e indique cuántos dígitos tiene */

import java.util.Scanner;

public class Wiki04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número entre 1 y 1000");
        String numero = entrada.nextLine();
        int digitos = numero.length();
        System.out.println("El número introducido contiene "+digitos+" dígitos");
    }
}
