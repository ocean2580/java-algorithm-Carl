package ocean.hashtable.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // 有序数组 才使用双指针法

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {  // 此后都是正数
                return res;
            }

            if (i > 0 && nums[i] == nums[i - 1]) { // 组间去重
                continue;
            }

            int left = i + 1;   // 双指针法
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (right > left && nums[right] == nums[right - 1]) right--; // 去重
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;    // 新数
                    left++;
                }
            }
        }
        return res;
    }
}
