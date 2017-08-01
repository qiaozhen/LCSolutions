package M;

import java.util.*;

/**
 * Created by qiaozhen on 23/07/2017.
 */
public class PhoneNum2String {
    public List<String> solution(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) return result;

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        /** Depth-First Search */
        /*
        Stack<String> stack = new Stack<String>();
        stack.push("");
        while (!stack.isEmpty()) {
            String s = stack.pop();
            if (s.length() < digits.length()) {
                int i = Character.getNumericValue(digits.charAt(s.length()));
                for (char c : mapping[i].toCharArray()) {
                    stack.push(s + c);
                }
            }
            else {
                result.add(s);
            }
        }
        */

        /** Breadth-First Search */
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("");
        while (queue.peek().length() < digits.length()) {
            String s = queue.remove();
            int i = Character.getNumericValue(digits.charAt(s.length()));
            for (char c : mapping[i].toCharArray()) {
                queue.add(s+c);
            }
        }
        result = queue;

        return result;
    }
}
