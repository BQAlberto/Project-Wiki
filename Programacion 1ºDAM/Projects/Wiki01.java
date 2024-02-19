/* 1. Haz un programa que solicite dos números y diga si son o no iguales */

import java.util.Scanner;

public class Wiki01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Introuce el primer número");
        String primerNumero = entrada.nextLine();

        System.out.println("Introduce el segundo número");
        String segundoNumero = entrada.nextLine();

        if (primerNumero.equals(segundoNumero)){
            System.out.println("Los números son iguales");
        }else System.out.println("Los números son diferentes");
    }
}
