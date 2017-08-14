package M;

/**
 * Created by qiaozhen on 06/08/2017.
 */
public class Divid2Integers {
    public int solution(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        int sign = ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) ? 1 : -1;
        long remains = Math.abs((long)dividend);
        long unit = Math.abs((long)divisor);
        if (unit == 1) return (sign > 0 ? (int)remains : 0-(int)remains);
        long sum = unit;
        int factor = 0;
        int times = 0;
        while (remains >= sum) {
            remains -= sum;
            sum += sum;
            factor = (factor == 0 ? 1 : factor + factor);
            times += factor;
            if (remains == sum) {
                times += (times + times);
                return sign > 0 ? times : 0-times;
            }
            else if (remains < sum) {
                sum = unit;
                factor = 0;
            }
        }

        return sign > 0 ? times : 0-times;
    }
}
