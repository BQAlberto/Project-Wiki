package Wiki03txt;

public class ImprimirBarras {

    static void imprimirBarras(char[] barras) {    // Método para imprimir las barras y meter espacios entre ellas.
        for (char c : barras) {
            System.out.print(c + " ");
        }
            System.out.println();
    }

}
