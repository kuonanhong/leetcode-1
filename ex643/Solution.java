package leetcode.ex643;

public class Solution{
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        for (int i = 0; i < k; i ++){
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++){
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return (double)max / k;
    }
}