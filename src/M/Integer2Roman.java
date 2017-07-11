package M;

/**
 * Created by bqhuang on 17/7/11.
 */
public class Integer2Roman {
    public String solution(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] mark = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result = result + mark[i];
            }
        }
        return result;
    }
}
