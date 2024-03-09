package AA1;

import java.util.Random;

public class P2Board {

    Random random = new Random();
    int randomRow_E;
    int randomColumn_E;
    static int randomRow_P2;
    static int randomColumn_P2;
    private static int longBoard = 6;
    int enemies = 8;
    int enemiesCount = 0;
    boolean positionedPlayer;
    private static  String[][] board = new String[longBoard][longBoard];                     /* Tablero */

    public void createBoard() {

        for (int i = 0; i< longBoard; i++) {
            for (int j = 0; j< longBoard; j++) {
                board[i][j] = BoardComponents.getFree();
            }
        }

        board[0][5] = BoardComponents.getS();

        while (enemies > enemiesCount) {
            randomRow_E = random.nextInt(0, longBoard);
            randomColumn_E = random.nextInt(0, longBoard);

            if (board[randomRow_E][randomColumn_E].equals(BoardComponents.getFree())){
                board[randomRow_E][randomColumn_E] = BoardComponents.getEnemy();
                enemiesCount++;
            }
        }

        while (!positionedPlayer) {
            randomRow_P2 = random.nextInt(longBoard);
            randomColumn_P2 = random.nextInt(longBoard);

            if (board[randomRow_P2][randomColumn_P2].equals(BoardComponents.getFree())) {
                board[randomRow_P2][randomColumn_P2] = BoardComponents.getPlayer();
                positionedPlayer = true;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i< longBoard; i++) {
            for (int j = 0; j< longBoard; j++) {
                if (board[i][j].equals(BoardComponents.getEnemy())){
                    System.out.print("X   ");
                }else{
                    System.out.print(board[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }

    public void cheatBoard() {
        for (int i = 0; i< longBoard; i++) {
            for (int j = 0; j< longBoard; j++) {
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static String [][] getBoard() {return board;}
    public static int getLongBoard(){
        return longBoard;
    }
    public static int getRandomRow_P2() {return randomRow_P2;}
    public static int getRandomColumn_P2() {return randomColumn_P2;}

}
