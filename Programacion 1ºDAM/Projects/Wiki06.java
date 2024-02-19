/* 6.Realiza un programa donde el usuario tenga que introducir 3 números
y el programa calcule cuál de ellos es el mayor de todos. Lo mostrará por pantalla. */


import java.util.Scanner;

public class Wiki06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los 3 números");

        int[] numeros = new int [3];
        numeros[0] = teclado.nextInt();
        numeros[1] = teclado.nextInt();
        numeros[2] = teclado.nextInt();

        int numMayor = numeros[0];

        for (int i=1; i<numeros.length; i++){
            if (numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }
        System.out.println("El mayor número introducido es: "+numMayor);
    }
}
