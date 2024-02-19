/* 1.Realiza un programa que sea capaz de seleccionar, aleatoriamente, una palabra
    de entre 5 que introducirá el usuario por teclado */

import java.util.Random;
import java.util.Scanner;

public class Wiki01txt {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 5 palabras");

        String[] palabras = new String[5];
        palabras[0] = teclado.nextLine();
        palabras[1] = teclado.nextLine();
        palabras[2] = teclado.nextLine();
        palabras[3] = teclado.nextLine();
        palabras[4] = teclado.nextLine();

        Random numeroRandom = new Random();
        int aleatorio = numeroRandom.nextInt(palabras.length);

        System.out.println("La palabra escogida aleatoriamente es: "+palabras[aleatorio]);
    }
}

