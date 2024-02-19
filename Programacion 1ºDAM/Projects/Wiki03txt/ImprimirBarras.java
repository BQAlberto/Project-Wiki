package Wiki03txt;

public class ImprimirBarras {

    private static int cantidadLetras = Diccionario.getObtenerPalabra().length();
    public static void imprimirBarras (int cantidadLetras){
        for (int i = 0; i<cantidadLetras; i++){
            System.out.print("_");
        }
        System.out.println();
    }

    public static void getImprimirBarras(){
        imprimirBarras(cantidadLetras);
    }

}
