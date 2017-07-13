package E;

import java.util.*;

/**
 * Created by qiaozhen on 11/07/2017.
 */
public class LongestCommonPrefix {
    public String solution(String[] strs) {
        if (strs.length <= 1)
            return "";

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > 0) {
                String k = strs[i].substring(0, 1);
                if (map.containsKey(k)) {
                    ArrayList<String> list = map.get(k);
                    list.add(strs[i].substring(1));
                    map.put(k, list);
                }
                else {
                    ArrayList<String> list = new ArrayList<String>();
                    list.add(strs[i].substring(1));
                    map.put(k, list);
                }
            }
        }

        String result = "";
        for (Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            ArrayList<String> list = entry.getValue();
            if (list.size() > 1) {
                String[] subStrs = list.toArray(new String[list.size()]);
                String pref = entry.getKey() + solution(subStrs);
                if (pref.length() > result.length()) {
                    result = pref;
                }
            }
        }

        return result;
    }
}
