package ocean.array.leetcode;

public class MinSubArrLen {
    public int slideWindow(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];    // 移动
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public int easy(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for (int j = i+1; j<nums.length; j++) {
                if (temp < s) temp += nums[j];
                else result = Math.min(result, j - i);  // 比较
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
