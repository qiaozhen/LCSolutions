package M;

import java.util.*;

/**
 * Created by qiaozhen on 17/07/2017.
 */
public class ThreeSum {
    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i-1] == nums[i]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == 0 - nums[i]) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k - 1 && nums[j] == nums[j + 1]) j++;
                    while (j < k - 1 && nums[k] == nums[k - 1]) k--;
                    j++; k--;
                }
                if (nums[j] + nums[k] < 0 - nums[i]) j++;
                if (nums[j] + nums[k] > 0 - nums[i]) k--;
            }
        }
        return result;
    }
}
