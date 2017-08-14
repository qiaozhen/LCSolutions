package M;

/**
 * Created by qiaozhen on 12/08/2017.
 */
public class SearchInsertPosition {
    public static int res;

    public int solution(int[] nums, int target) {
        res = 0;
        binarySearch(nums, 0, nums.length-1, target);
        return res;
    }

    public void binarySearch(int[] nums, int s, int e, int target) {
        if (s >= e) {
            res = nums[s] >= target ? s : s+1;
        }
        else if (nums[s+(e-s)/2] >= target) {
            res = s+(e-s)/2;
            binarySearch(nums, s, s+(e-s)/2, target);
        }
        else {
            res = s+(e-s)/2 + 1;
            binarySearch(nums, s+(e-s)/2 + 1, e, target);
        }
    }
}
