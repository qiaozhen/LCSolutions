package M;

import java.util.*;

/**
 * Created by qiaozhen on 17/07/2017.
 */
public class ThreeSum {
    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i ++) {
            if (nums[i] !=0 && nums[i] == nums[i+1]) continue;
            int lp = i;
            int rp = nums.length - 1;
            int tar = 0 - nums[i];
            while (lp < rp) {
                if (nums[lp] + nums[rp] == tar) res.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                while (lp < rp && nums[lp] == nums[lp+1]) lp++;
                while (lp < rp && nums[rp] == nums[rp-1]) rp--;
                lp++;
                rp--;
            }
        }

        return res;
    }
}
