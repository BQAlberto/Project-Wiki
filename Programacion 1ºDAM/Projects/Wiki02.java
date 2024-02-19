/* 2.Realiza un programa que solicite un número y diga si es positivo o negativo */

import java.util.Scanner;

public class Wiki02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduce el número");
        int numero = entrada.nextInt();

        if (numero >=0){
            System.out.println("El número es positivo");
        }else System.out.println("El número es negativo");
    }
}
