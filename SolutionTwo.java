import java.util.Arrays;
import java.util.List;

public class SolutionTwo {

    /*
    This structure of the board will register the location where player place X and O
    For example, for the following board:

    moves || board position
    X O X || 1 2 3
    O X O || 4 5 6
    0 X 0 || 7 8 9

    xLocation = [1,3,5,8] and oLocation = [2,4,6,7,9]
     */
    public static class Board {
        List<Integer> xLocation;
        List<Integer> oLocation;

    }

    /*
    This array contains all possible winning combinations for a tic-tac-toe game
    Regardless of the playing sequence, as long as the player have their markers appear
    at locations that can make up one or more of the following combinations, the player
    win the game
     */
    private static final List<List<Integer>> winningCombinations = Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5,6),
            Arrays.asList(7,8,9),
            Arrays.asList(1,4,7),
            Arrays.asList(2,5,8),
            Arrays.asList(3,6,9),
            Arrays.asList(1,5,9),
            Arrays.asList(3,5,7)
    );


    /*
    Check if X player has win, if not, check if O player has win
    If neither win, return '-'
     */
    public char checkWin(Board board) {
        if(checkWin(board.xLocation)) return 'X';
        else if(checkWin(board.oLocation)) return 'O';
        return '-';
    }

    /*
    Compare the marker location list against the winning combinations to
    determine if the player has win.
     */
    private boolean checkWin(List<Integer> playerMoves) {
        if (playerMoves.size() < 3) return false;
        for (int i = 0; i < winningCombinations.size(); i++) {
            if (playerMoves.contains(winningCombinations.get(i).get(0))
                    && playerMoves.contains(winningCombinations.get(i).get(1))
                    && playerMoves.contains(winningCombinations.get(i).get(2))
            ) return true;
        }
        return false;
    }
}
