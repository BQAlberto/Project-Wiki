/* Realiza un programa que solicite tres números y los pinte en la pantalla ordenados
de menor a mayor. Si el usuario introduce el 10, el 20 y el 2, el programa mostrará: “2 10 20” */

import java.util.Arrays;
import java.util.Scanner;

public class Wiki03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduce los tres números");
        int[] numeros = new int[3];
        numeros[0] = entrada.nextInt();
        numeros[1] = entrada.nextInt();
        numeros[2] = entrada.nextInt();

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));









    }
}
