import java.util.Scanner;

public class Wiki12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoja tipo de conversion"+ "\n1: DOLAR a EURO \n2: EURO A DOLAR");

        int conversion = teclado.nextInt();

        switch (conversion){
            case 1:
                System.out.println("Introduzca cantidad de dolares a convertir en euros");
                double dolares = teclado.nextDouble();
                System.out.println(dolares + "$ son " + dolares*0.93 + "€");
                break;

            case 2:
                System.out.println("Introduzca cantidad de euros a convertir en dólares");
                double euros = teclado.nextDouble();
                System.out.println(euros + "€ son " + euros*1.08 + "$");
                break;

            default:
                System.out.println("Introduzca valor correcto");
        }

    }
}
