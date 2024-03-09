package AA1;

import java.util.Scanner;

public class P1Movement {

    Scanner scanner = new Scanner(System.in);
    int posxP1;
    int posyP1;
    private int numPositions;
    private char direction;
    private static int p1Lives = 3;
    public void move() {
        int newPosX = posxP1;
        int newPosY = posyP1;

        System.out.println("Ingrese número de posiciones (del 1 al 3) y direccion");
        numPositions = scanner.nextInt();
        if (numPositions > 3){
            System.out.println("ERROR! Máximo de posiciones en un movimiento 3");
            System.out.println("Vuelva a ingresar número de posiciones (del 1 al 3) y direccion");
            numPositions = scanner.nextInt();
        }
        direction = scanner.next().charAt(0);

        switch (direction){
            case 'D':
                newPosY = (posyP1 + numPositions) % P1Board.getLongBoard();
                break;
            case 'A':
                newPosY = (posyP1 - numPositions + P1Board.getLongBoard()) % P1Board.getLongBoard();
                break;
            case 'W':
                newPosX = (posxP1 - numPositions + P1Board.getLongBoard()) % P1Board.getLongBoard();
                break;
            case 'S':
                newPosX = (posxP1 + numPositions) % P1Board.getLongBoard();
                break;
            default:
                System.out.println("Dirección incorrecta, la dirección debe ser -> D A W S (MAYUS.)");
                return;
        }

        if (P1Board.getBoard()[newPosX][newPosY] == BoardComponents.getEnemy()){
            System.out.println("Has caido en una casilla con enemigo!!");
            p1Lives--;
            P1Board.getBoard()[newPosX][newPosY] = BoardComponents.getPlayer();
            P1Board.getBoard()[posxP1][posyP1] = BoardComponents.getFree();
        } else if (P1Board.getBoard()[newPosX][newPosY] == BoardComponents.getS()) {
            System.out.println("Enhorabuena jugador 1, has ganado!!!");
            System.exit(0);
        } else {
            P1Board.getBoard()[newPosX][newPosY] = BoardComponents.getPlayer();
            P1Board.getBoard()[posxP1][posyP1] = BoardComponents.getFree();
        }

        posxP1 = newPosX;
        posyP1 = newPosY;

    }

    public static int getP1lives(){
        return p1Lives;
    }

    public void setInitialPosition(int x, int y) {
        posxP1 = x;
        posyP1 = y;
    }

}
