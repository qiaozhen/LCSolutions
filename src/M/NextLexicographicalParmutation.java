package M;

/**
 * Created by qiaozhen on 07/08/2017.
 */
public class NextLexicographicalParmutation {
    public int[] solution(int[] nums) {
        if (nums.length < 2) return nums;
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i-1] < nums[i]) break;
            i--;
        }
        if (i == 0) {
            descentSort(nums, 0, nums.length-1, Integer.MAX_VALUE);
            return nums;
        }

        int x = descentSort(nums, i, nums.length-1, nums[i-1]);
        int t = nums[x];
        nums[x] = nums[i-1];
        nums[i-1] = t;
        return nums;
    }

    public int descentSort(int[] nums, int start, int end, int target) {
        int swap = end;
        for (int k = 0; k < (end-start)/2+1; k++) {
            int tv = nums[start+k];
            nums[start+k] = nums[end-k];
            nums[end-k] = tv;

            if (nums[start+k] > target && nums[start+k] <= nums[swap]) swap = Math.min(start+k, swap);
            if (nums[end-k] > target && nums[end-k] < nums[swap]) swap = Math.min(end-k, swap);
        }

        return swap;
    }
}
