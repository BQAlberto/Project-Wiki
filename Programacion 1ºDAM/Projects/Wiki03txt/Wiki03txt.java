package Wiki03txt;

import java.util.Scanner;

public class Wiki03txt {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean palabraAcertada;

        System.out.println("Bienvenido al juego del ahorcado");

        //Diccionario.getObtenerPalabra();   // Obtener palabra al azar. NO ES NECESARIO YA QUE EL MÉTODO ARRANCA CON EL GET IMPRIMIRBARRAS
        ImprimirBarras.getImprimirBarras();

        System.out.println("¿Con cuantos intentos quieres jugar?");
        int intentosRestantes = teclado.nextInt();
        teclado.nextLine();

        do {   //*********CONSEGUIR QUE ESTE BUCLE FUNCIONE AVERIGUAR POR QUE INTENTOSRESTANTES <1 FINALIZA EL BUCLE
            System.out.println("Introduce una letra");
            String letraIntroducida = teclado.nextLine();

            intentosRestantes--;
        } while (intentosRestantes < 1 );   // || palabraAcertada = true meter en el paréntesis?¿ ?¿Quízas no se pueda poner como condicion un boolean con otro?

        System.out.println("La palabra era: " + Diccionario.getPalabraGenerada());
    }
}
