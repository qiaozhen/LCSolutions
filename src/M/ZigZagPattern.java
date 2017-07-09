package M;

/**
 * Created by qiaozhen on 09/07/2017.
 */


/** ZigZag Pattern

 n=numRows

 Δ=2n-2    0                              2(n-1)
 Δ=        1                      2(n-1)-1  .
 Δ=        2             2(n-1)-2
 Δ=        .          .
 Δ=        .     n+1
 Δ=        n-2 n
 Δ=2n-2    n-1

 */


public class ZigZagPattern {

    public String solution(String s, int numRows) {
        int len = s == null ? 0 : s.length();
        if (len <= numRows || numRows == 1) { /** @warning numRows == 1 */
            return s;
        }

        char[] a = s.toCharArray();
        String result = "";
        int row = 0;
        int column = 0;
        while (result.length() < a.length) {
            if (row > 0 && row < numRows - 1 && column > 0) {
                int index = column * 2 * (numRows - 1) - row;
                if (index >= 0 && index < a.length) {
                    result += a[index];
                }
            }

            int index = row + column * 2 * (numRows - 1);
            if (index >= 0 && index < a.length) {
                result += a[index];
                column++;
            } else {
                column = 0;
                row++;
            }
        }

        return result;
    }
}
