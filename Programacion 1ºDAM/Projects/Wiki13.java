import java.util.Scanner;

public class Wiki13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Boolean continuar = true;

        do {
            System.out.println("Introduzca un numero");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            }else System.out.println("El número es impar");

            System.out.println("¿Quieres continuar?  true/false");
            continuar = teclado.nextBoolean();

        }while (continuar);

    }


}
