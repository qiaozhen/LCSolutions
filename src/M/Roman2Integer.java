package M;

import java.util.HashMap;

/**
 * Created by bqhuang on 17/7/11.
 */
public class Roman2Integer {

    public int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] a = s.toCharArray();
        int f = 0;
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (map.get(a[i]) < f) {
                sum -= map.get(a[i]);
            }
            else {
                sum += map.get(a[i]);
                f = map.get(a[i]);
            }
        }

        return sum;
    }
}
