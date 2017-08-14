package M;

import java.util.*;

/**
 * Created by qiaozhen on 7/31/17.
 */
public class FourSum {
    public List<List<Integer>> solution(int[] nums, int target) {
        if (nums.length < 4) return Arrays.asList();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int s = 0; s < nums.length - 3; s++) {
            if (s != 0 && nums[s - 1] == nums[s]) continue;
            int t3 = target - nums[s];
            for (int i = s + 1; i < nums.length - 2; i++) {
                if (i != s + 1 && nums[i - 1] == nums[i]) continue;
                int t2 = t3 - nums[i];
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[j] + nums[k] == t2) {
                        result.add(Arrays.asList(nums[s], nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                    }
                    else if (nums[j] + nums[k] < t2) j++;
                    else k --;
                }
            }
        }
        return result;
    }
}
