package AA1;

import java.util.Random;

public class Board {
    Random random = new Random();
    int randomRow;
    int randomColumn;
    int randomRow_P1;
    int randomColumn_P1;
    int longBoard = 6;
    int enemies = 8;
    int X = 0;
    boolean positionedPlayer;
    String[][] board = new String[longBoard][longBoard];                                                              /* Tablero */
    String[][] boardSeen = new String[longBoard][longBoard];                                                          /*Tablero que el usuario va a visualizar*/

    public void createBoard() {

        for (int i = 0; i< longBoard; i++) {
            for (int j = 0; j< longBoard; j++) {
                board[i][j] = BoardComponents.getFree();
            }
        }

        board[0][5] = BoardComponents.getS();

        while (enemies > X) {
            randomRow = random.nextInt(0, longBoard);
            randomColumn = random.nextInt(0, longBoard);

            if (board[randomRow][randomColumn].equals(BoardComponents.getFree())){
                board[randomRow][randomColumn] = BoardComponents.getEnemy();
                X++;
            }
        }

        while (!positionedPlayer) {
            randomRow_P1 = random.nextInt(0, longBoard);
            randomColumn_P1 = random.nextInt(0, longBoard);

            if (board[randomRow_P1][randomColumn_P1].equals(BoardComponents.getFree())) {
                board[randomRow_P1][randomColumn_P1] = BoardComponents.getPlayer();
                positionedPlayer = true;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i< longBoard; i++) {
            for (int j = 0; j< longBoard; j++) {
                if (board[i][j].equals(BoardComponents.getEnemy())){
                    System.out.print("L   ");
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

    public String [][] getBoard() {return board;}
    public int getRandomRow_P1() {return randomRow_P1;}
    public int getRandomColumn_P1() {return randomColumn_P1;}
}
