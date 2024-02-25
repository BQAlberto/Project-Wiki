package Wiki03txt;

import java.util.Random;

public class Diccionario {

    private static String[] palabras = {
        "gato", "perro", "casa", "coche", "pelota",
        "mesa", "silla", "libro", "luz", "ventana",
        "amarillo", "rojo", "azul", "verde", "naranja",
        "computadora", "telefono", "television", "jardin", "cielo",
        "jugar", "correr", "comer", "estudiar", "dormir",
        "feliz", "triste", "enfadado", "contento", "cansado",
        "montaña", "playa", "rio", "ciudad", "bosque",
        "viajar", "leer", "escribir", "pintar", "cantar",
        "familia", "amigo", "amor", "vida", "tiempo", "altavoz", "flor",
        "raton", "rueda", "tren", "avion", "cuadro"
    };

    private static String palabraGenerada;

    private static String obtenerPalabra (String[] palabras) {    // método que genera palabra random.
        Random random = new Random();
        int numAleatorio = random.nextInt(palabras.length);
        return palabraGenerada = palabras[numAleatorio];
    }

    private static int cantidadLetras = getObtenerPalabra().length();

    public static String getPalabraGenerada(){
        return palabraGenerada;
    }

    public static String getObtenerPalabra(){
        return obtenerPalabra(palabras);
    }

    public static int getCantidadLetras(){
        return cantidadLetras;
    }

}
