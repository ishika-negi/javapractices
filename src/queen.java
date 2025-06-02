public class queen {
    // Check if it's safe to place a queen at board[row][col]
    public static boolean issafe(char board[][], int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Recursive function to solve the N-Queens problem
    public static void nqueens(char board[][], int row) {
        // Base case: If all queens are placed
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nqueens(board, row + 1); // Recursive call
                board[row][j] = 'X'; // Backtrack (remove queen)
            }
        }
    }

    // Function to print the chessboard
    public static void printBoard(char board[][]) {
        System.out.println("---------- CHESS BOARD ----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function to test the N-Queens solution
    public static void main(String args[]) {
        int n = 4; // Change this value for different board sizes
        char board[][] = new char[n][n];

        // Initialize the board with '.' (empty spaces)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X'; // Empty space
            }
        }

        nqueens(board, 0); // Start solving from the first row
    }
}