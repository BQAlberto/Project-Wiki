package AA1;

import java.util.Scanner;

public class Game {
    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("___________ BIENVENIDOS AL JUEGO ___________");
        System.out.println();

        P1Board p1Board = new P1Board();
        P2Board p2Board = new P2Board();
        p1Board.createBoard();
        p2Board.createBoard();

        P1Movement p1Movement = new P1Movement();           //establezco posición inicial P1.
        int p1InitialRow = P1Board.getRandomRow_P1();
        int p1InitialColumn = P1Board.getRandomColumn_P1();
        p1Movement.setInitialPosition(p1InitialRow, p1InitialColumn);

        P2Movement p2Movement = new P2Movement();           //establezco posición inicial P2.
        int p2InitialRow = P2Board.getRandomRow_P2();
        int p2InitialColumn = P2Board.getRandomColumn_P2();
        p2Movement.setInitialPosition(p2InitialRow, p2InitialColumn);

        do {
            System.out.println("------------------------------------");
            System.out.println("TURNO DEL JUGADOR 1       " + "Vidas restantes: " + P1Movement.getP1lives());
            System.out.println();
            p1Board.printBoard();
            System.out.println("-----------------------");
            p1Board.cheatBoard();
            System.out.println("Jugador 1, Marca tu movimiento");
            p1Movement.move();
            p1Board.printBoard();
            System.out.println("Jugador 1 le quedan" + " " + P1Movement.getP1lives() + " " + "vidas");
            if (P1Movement.getP1lives() < 1){
                System.out.println("Gana Jugador2 !!!!!!");
                break;
            }
            System.out.println("------------------------------------");
            System.out.println("TURNO DEL JUGADOR 2       " + "Vidas restantes: " + P2Movement.getP2lives());
            System.out.println();
            p2Board.printBoard();
            System.out.println("-----------------------");
            p2Board.cheatBoard();
            System.out.println("Jugador 2, Marca tu movimiento");
            p2Movement.move();
            p2Board.printBoard();
            System.out.println("Jugador 2 le quedan" + " " + P2Movement.getP2lives() + " " + "vidas");
        }while (P2Movement.getP2lives() >= 1);

        if (P2Movement.getP2lives() < 1){
            System.out.println("Gana Jugador1 !!!!!!");
        }

    }
}
