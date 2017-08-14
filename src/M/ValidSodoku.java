package M;

import java.util.HashSet;

/**
 * Created by qiaozhen on 14/08/2017.
 */
public class ValidSodoku {
    public boolean solution(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> column = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !column.add(board[j][i]))
                    return false;
                int r = (i/3)*3 + j/3;
                int c = (i%3)*3 + j%3;
                if (board[r][c] != '.' && !cube.add(board[r][c]))
                    return false;
            }
        }

        return true;
    }
}
