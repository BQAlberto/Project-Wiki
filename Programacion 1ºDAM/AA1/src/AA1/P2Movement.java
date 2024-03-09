package AA1;

import java.util.Scanner;

public class P2Movement {

    Scanner scanner = new Scanner(System.in);
    int posxP2;
    int posyP2;
    private int numPositions;
    private char direction;
    private static int p2Lives = 3;
    public void move() {
        int newPosX = posxP2;
        int newPosY = posyP2;

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
                newPosY = (posyP2 + numPositions) % P2Board.getLongBoard();
                break;
            case 'A':
                newPosY = (posyP2 - numPositions + P2Board.getLongBoard()) % P2Board.getLongBoard();
                break;
            case 'W':
                newPosX = (posxP2 - numPositions + P2Board.getLongBoard()) % P2Board.getLongBoard();
                break;
            case 'S':
                newPosX = (posxP2 + numPositions) % P2Board.getLongBoard();
                break;
            default:
                System.out.println("Dirección incorrecta, la dirección debe ser -> D A W S (MAYUS.)");
                return;
        }

        if (P2Board.getBoard()[newPosX][newPosY] == BoardComponents.getEnemy()){
            System.out.println("Has caido en una casilla con enemigo!!");
            p2Lives--;
            P2Board.getBoard()[newPosX][newPosY] = BoardComponents.getPlayer();
            P2Board.getBoard()[posxP2][posyP2] = BoardComponents.getFree();
        } else if (P2Board.getBoard()[newPosX][newPosY] == BoardComponents.getS()) {
            System.out.println("Enhorabuena jugador 2, has ganado!!!");
            System.exit(0);
        } else {
            P2Board.getBoard()[newPosX][newPosY] = BoardComponents.getPlayer();
            P2Board.getBoard()[posxP2][posyP2] = BoardComponents.getFree();
        }

        posxP2 = newPosX;
        posyP2 = newPosY;

    }

    public static int getP2lives(){
        return p2Lives;
    }

    public void setInitialPosition(int x, int y) {
        posxP2 = x;
        posyP2 = y;
    }

}
