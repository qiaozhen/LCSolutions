package M;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiaozhen on 31/07/2017.
 */
public class GenerateParentheses {
    public List<String> solution(int n) {
        ArrayList<String> result = new ArrayList<String>();
        backtracking(result, "", 0, 0, n);
        return result;
    }

    private void backtracking(List<String> list, String s, int open, int close, int n) {
        if (s.length() == n*2) {
            list.add(s);
            return;
        }

        if (open < n) backtracking(list, s+"(", open+1, close, n);
        if (open > close) backtracking(list, s+")", open, close+1, n);
    }
}
