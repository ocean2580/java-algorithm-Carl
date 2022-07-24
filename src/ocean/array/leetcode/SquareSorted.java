package ocean.array.leetcode;

import java.util.Arrays;

public class SquareSorted {
    public int[] doublePointer(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;

        while (left <= right) { // 两头趋中
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    public int[] easy(int[] nums) { // 暴力
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }

}
