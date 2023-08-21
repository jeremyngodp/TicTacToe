public class SolutionOne {
    /*
    Use char matrix of síze 3x3 to represent the board
    Initially, all elements in the matrix is initialised
    to character 'n' to denote that the square has not
    been touched
     */
    char[][] board = new char[3][3];

    /*
    Checking if there is any win on all the directions
    Return X or O if there is a winner, else return '-' to
    indicate no winner.
     */
    public char checkWin(char[][] board) {
        char horizontal = checkHorizontal(board);
        if (horizontal != '-') return horizontal;

        char vertical = checkVertical(board);
        if (vertical != '-') return vertical;

        return checkDiagonal(board);
    }

    /*
    Checking if there is any win on the horizontal direction
    Return X or O if there is a winner, else return '-' to
    indicate no winner.
     */
    private char checkHorizontal(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][0] == 'X') return 'X';
                else if (board[i][0] == 'O') return 'O';
            }
        }
        return '-';
    }

    /*
    Checking if there is any win on the vertical direction
    Return X or O if there is a winner, else return '-' to
    indicate no winner.
     */
    private char checkVertical(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[0][i] == 'X') return 'X';
                else if (board[0][i] == 'O') return 'O';
            }
        }
        return '-';
    }

    /*
    Checking if there is any win on the diagonal direction
    Return X or O if there is a winner, else return '-' to
    indicate no winner.
     */
    private char checkDiagonal(char[][] board) {
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] == 'X') return 'X';
            else if (board[0][0] == 'O') return 'O';
        }

        if(board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            if (board[0][0] == 'X') return 'X';
            else if (board[0][0] == 'O') return 'O';
        }
        return '-';
    }
}
