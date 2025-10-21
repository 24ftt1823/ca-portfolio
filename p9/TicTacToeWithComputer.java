import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        boolean gameEnded = false;
        char winner = ' ';

        while (!gameEnded) {
            // Player's turn
            printBoard(board);
            System.out.println("Player's turn");
            int row = -1, col = -1;
            while (true) {
                System.out.print("Enter a row (0,1 or 2): ");
                row = sc.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                col = sc.nextInt();
                if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            // Check if player won
            winner = checkWinner(board);
            if (winner != ' ' || isBoardFull(board)) {
                gameEnded = true;
                break;
            }

            // Computer's turn (random)
            while (true) {
                int compRow = (int)(Math.random() * 3);
                int compCol = (int)(Math.random() * 3);
                if (board[compRow][compCol] == ' ') {
                    board[compRow][compCol] = 'O';
                    break;
                }
            }

            // Check if computer won or board full
            winner = checkWinner(board);
            if (winner != ' ' || isBoardFull(board)) {
                gameEnded = true;
            }
        }

        // Print final board and result
        
        if (winner == 'X') {
            System.out.println("Game ended, Player Win");
            printBoard(board);
        } else if (winner == 'O') {
            System.out.println("Game ended, CPU Win");
            printBoard(board);
        } else {
            System.out.println("Game ended, Draw");
            printBoard(board);
        }

        sc.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }

    public static char checkWinner(char[][] b) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] != ' ' && b[i][0] == b[i][1] && b[i][1] == b[i][2]) return b[i][0];
            if (b[0][i] != ' ' && b[0][i] == b[1][i] && b[1][i] == b[2][i]) return b[0][i];
        }
        if (b[0][0] != ' ' && b[0][0] == b[1][1] && b[1][1] == b[2][2]) return b[0][0];
        if (b[0][2] != ' ' && b[0][2] == b[1][1] && b[1][1] == b[2][0]) return b[0][2];
        return ' ';
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
