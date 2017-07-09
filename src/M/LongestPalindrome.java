/**
 * Created by qiaozhen on 09/07/2017.
 */

public class LongestPalindrome {
    public String solution(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] a = s.toCharArray();
        int li = 0;
        int ri = 0;

        for (int i = 0; i < a.length;) {
            int l = i;
            int r = i;
            while (r < a.length && a[r] == a[l]) {
                r++;
            }
            i = r;

            l--;
            while (r < a.length && l >= 0) {
                if (a[r] != a[l]) {
                    break;
                }
                r++;
                l--;
            }

            r--;
            l++;
            if (r-l > ri-li) {
                li = l;
                ri = r;
            }
        }

        return s.substring(li, ri+1);

    }
}
