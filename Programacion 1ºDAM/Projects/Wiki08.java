
import java.util.Scanner;

public class Wiki08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca 3 números");
        String numero1 = teclado.nextLine();
        String numero2 = teclado.nextLine();
        String numero3 = teclado.nextLine();

        String linea = (numero1+" "+numero2+" "+numero3);

        System.out.println(linea);

    }
}
