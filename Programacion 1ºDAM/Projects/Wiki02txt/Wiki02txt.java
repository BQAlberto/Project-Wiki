/* 2.Realiza una aplicación donde el usuario pueda almacenar información de personas (nombre, apellidos y dirección),
    de forma que luego pueda buscar por apellido a cualquiera de ellas. Puedes preparar un menú donde el usuario pueda
    escoger entre introducir una nueva persona o buscar a alguien */

package Wiki02txt;
import java.util.ArrayList;
import java.util.Scanner;

public class Wiki02txt {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> agenda = new ArrayList<>();

        while (true) {    //si no usamos el while true sale al finalizar y por lo tanto resetea la agenda.
            System.out.println("¿Qué desea hacer? 1:Alta persona 2:Buscar persona  3:Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();     //rompe el salto de linea

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduzca apellido: ");
                    String apellido = teclado.nextLine();
                    System.out.println("Introduzca dirección: ");
                    String direccion = teclado.nextLine();

                    Persona nuevaPersona = new Persona(nombre, apellido, direccion);
                    agenda.add(nuevaPersona);
                    System.out.println("Persona agregada correctamente");
                    break;

                case 2:
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía. No hay personas para buscar.");
                    } else {
                        System.out.println("Introduzca apellido a buscar");
                        String busquedaApellido = teclado.nextLine();
                        boolean encontrado = false;

                        for (Persona persona : agenda) {     //uso for each
                            if (persona.getApellido().equalsIgnoreCase(busquedaApellido)) {
                                System.out.println("Persona registrada: Nombre: " + persona.getNombre() + " " + persona.getApellido() + " " + persona.getDireccion());
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se ha encontrado ningún registro");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ha salido de la agenda, por lo que se reinicializara la misma.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Valor introducido incorrecto");
            }
        }
    }
}
