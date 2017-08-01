package M;

import java.util.Arrays;

/**
 * Created by qiaozhen on 23/07/2017.
 */
public class ThreeSumClosest {
    public int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0; boolean inited = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (!inited || Math.abs(temp - target) < Math.abs(result - target)) { /** Math.abs() overflow prolblem */
                    result = temp;
                    inited = true;
                }
                if (temp == target) return temp;
                if (temp < target) j++;
                if (temp > target) k--;
            }
        }
        return result;
    }
}
