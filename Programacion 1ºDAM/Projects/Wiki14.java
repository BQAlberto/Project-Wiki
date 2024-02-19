import java.util.Random;
import java.util.Scanner;

public class Wiki14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos intentos quieres tener?");
        int intentos = teclado.nextInt();

        int limiteInferior = 0;
        int limiteSuperior = 50;
        Random numero = new Random();
        int numeroRandom = numero.nextInt(limiteSuperior - limiteInferior);
        int i;

        int respuesta;
        do {
            System.out.println("¿Qué número crees que es?");
            respuesta = teclado.nextInt();

            for (i = 1; i < intentos; i++) {
                if (respuesta < numeroRandom) {
                    System.out.println("El número que buscas es mayor");
                    System.out.println("¿Qué número crees que es?");
                    respuesta = teclado.nextInt();
                } else if (respuesta > numeroRandom) {
                    System.out.println("El número que buscas es menor");
                    System.out.println("¿Qué número crees que es?");
                    respuesta = teclado.nextInt();
                } else System.out.println("ENHORABUENA!! NUMERO ACERTADO!!");
            }
        } while (i < intentos);

        System.out.println("Fin del juego. " + "El número a adivinar era " + numeroRandom);

    }
}
