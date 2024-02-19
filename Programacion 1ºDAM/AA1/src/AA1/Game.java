package AA1;

import java.util.Scanner;

public class Game {
    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO AL JUEGO");

        Board p1Board = new Board();
        p1Board.createBoard();
        p1Board.printBoard();
        System.out.println("-----------------------");
        p1Board.cheatBoard();
        System.out.println("Marca tu movimiento");
        scanner.nextLine();

    }
}
