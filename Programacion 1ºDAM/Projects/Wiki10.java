import java.util.Scanner;

public class Wiki10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca dos números");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numMenor = numero1;
        int numMayor = numero2;

        if (numero2 < numero1) {
            numMenor = numero2;
            numMayor = numero1;
        }

        for (int i = numMenor; i <= numMayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
