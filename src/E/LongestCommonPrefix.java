package E;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by qiaozhen on 11/07/2017.
 */
public class LongestCommonPrefix {
    public String solution(String[] strs) {
        HashMap<Character, HashSet<Integer>> map = new HashMap<Character, HashSet<Integer>>();
        for (int i = 0; i < strs.length; i++) {
            char c = strs[i].charAt(0);
            if (map.containsKey(c)) {
                map.get(c).add(i);
            }
            else {
                HashSet<Integer> set = new HashSet<Integer>();
                set.add(i);
                map.put(c, i);
            }
        }

        while (map.keySet().size() > 0) {

        }


        return commonPrefix;
    }
}
