package E;

/**
 * Created by qiaozhen on 31/07/2017.
 */

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 */

public class ValidParentheses {
    public boolean solution(String s) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        Stack<String> stack = new Stack<String>();
        for (Character c : s.toCharArray()) {
            if (map.values().contains(c.toString())) {
                stack.push(c.toString());
            }
            else if (map.keySet().contains(c.toString())) {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals(map.get(c.toString()))) return false;
            }
            else {
                return false;
            }
        }
        return (stack.size() == 0);
    }
}
