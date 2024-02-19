/* Haz un programa que calcule el área de diferentes forma geométricas. Puedes hacer un menú
donde el usuario pueda escoger entre algunas de ellas (cuadrado, rectángulo, círculo, triángulo, . . .).
El programa deberá pedir también las medidas necesarias y, finalmente, mostrará el área de la figura. */

import javax.swing.*;
import java.util.Scanner;

public class Wiki05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoga la forma geométrica que desea calcular: " +
                "\n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

        int figura = teclado.nextInt();

        switch (figura){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es: "+Math.pow(lado,2));
                break;
            case 2:
                int largo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo"));
                int ancho = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho"));
                System.out.println("El area del rectángulo es: "+largo*ancho);
                break;
            case 3:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triángulo es: "+base*altura/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.println("El area del círculo es: "+radio*radio*3.14);
                break;
            default:
                System.out.println("La opción no es correcta");

        }
    }
}
