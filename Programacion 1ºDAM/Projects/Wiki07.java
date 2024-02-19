/* 7.Realiza un programa que permite introducir al usuario una hora (formato 12 o 24 horas, hora, minuto y
    segundo por separado) y compruebe que es correcto cada uno de los datos que éste introduzca.
    En caso de fallo hará que el usuario vuelva a introducir el dato erróneo. */

import java.util.Scanner;

public class Wiki07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int hora = 0;
        int minutos;
        int segundos;

        do {
            System.out.println("Introduzca la hora (formato 24h)");
            hora = teclado.nextInt();
        } while (hora < 0 || hora > 24);

        do {
            System.out.println("Introduzca el minuto");
            minutos = teclado.nextInt();
        } while (minutos < 0 || minutos > 60);

        do {
            System.out.println("Introduzca los segundos");
            segundos = teclado.nextInt();
        } while (segundos < 0 || segundos > 60);

        System.out.println("Hora introducida segun usuario es: "+hora+":"+minutos+":"+segundos);
    }
}
