package Wiki03txt;

import java.util.Scanner;

public class Wiki03txt {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean palabraAcertada = false;

        char[] barras = new char[Diccionario.getCantidadLetras()];    // Array que mostrará letras adivinadas.
        for (int i = 0; i < Diccionario.getCantidadLetras(); i++) {   //  Bucle inicializa el array barras con barras , indicando que ninguna letra ha sido adivinada aún.
            barras[i] = '_';
        }

        System.out.println("Bienvenido al juego del ahorcado");

        ImprimirBarras.imprimirBarras(barras);   // Muestra las barras iniciales.

        System.out.println("¿Con cuantos intentos quieres jugar?");
        int intentosRestantes = teclado.nextInt();
        teclado.nextLine();

        do {
            System.out.println("Introduce una letra");
            String letraIntroducida = teclado.nextLine().toLowerCase();

            boolean letraAdivinada = false;

            for (int i = 0; i < Diccionario.getCantidadLetras(); i++) {   // Recorre la palabra y verifica si la letra introducida está presente. Si es así, actualiza el array barras con la letra adivinada.
                if (Diccionario.getPalabraGenerada().charAt(i) == letraIntroducida.charAt(0)) {
                    barras[i] = letraIntroducida.charAt(0);
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada){
                System.out.println("La  letra no aparece en la palabra");
                intentosRestantes--;
            }

            ImprimirBarras.imprimirBarras(barras);   // Impresion de la array barras actualizada.

            palabraAcertada = String.valueOf(barras).equals(Diccionario.getPalabraGenerada());

        } while (intentosRestantes > 0 && !palabraAcertada);

        if (palabraAcertada){
            System.out.println("Enhorabuena has ganado!!!!!!");
        }else {
            System.out.println("La palabra era: " + Diccionario.getPalabraGenerada());
        }

    }
}
