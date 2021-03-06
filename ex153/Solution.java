package leetcode.ex153;

import java.util.Arrays;

public class Solution {

	public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
	public int findMin_v2(int[] nums) {
		int lo = 0, hi = nums.length - 1;
        int mid = 0;
        while (lo < hi) {
        	if (nums[lo] < nums[hi]) {
				return nums[lo];
			}
        	mid = lo + (hi - lo) / 2;
        	if (nums[mid] >= nums[lo]) {
        		//right
        		lo = mid + 1;
			} else {
				//left
				hi = mid;
			}
		}
        return nums[lo];
    }
}
