package M;

/**
 * Created by qiaozhen on 12/08/2017.
 */
public class SearchRange {
    public int[] solution(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int[] binarySearch(int[] nums, int s, int e, int target) {
        if ((s > e) || (nums[s] > target || nums[e] < target)) return new int[]{-1, -1};

        if (nums[s] == target && nums[e] == target) return new int[]{s, e};
        int[] a = binarySearch(nums, s+1, s+(e-s)/2, target);
        int[] b = binarySearch(nums, s+(e-s)/2+1, e-1, target);
        if (nums[s] == target) {
            if (b[1] != -1) return new int[]{s, b[1]};
            if (a[1] != -1) return new int[]{s, a[1]};
            return new int[]{s, s};
        }
        if (nums[e] == target) {
            if (a[0] != -1) return new int[]{a[0], e};
            if (b[0] != -1) return new int[]{b[0], e};
            return new int[]{e, e};
        }

        if (a[0] != -1 && b[1] != -1) return new int[]{a[0], b[1]};
        return a[0] != -1 ? a : b;
    }
}
