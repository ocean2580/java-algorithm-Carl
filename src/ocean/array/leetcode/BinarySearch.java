package ocean.array.leetcode;

public class BinarySearch {

    public int searchLR(int[] nums, int target) {   // 左右闭
        if (target < nums[0] || target > nums[nums.length - 1]) { // 检测
            return -1;
        }
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)    // 趋中
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }

    public int searchLr(int[] nums, int target) {   // 左闭右开
        int left = 0, right = nums.length;

        while (left < right) {  // 等于则无意义
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid;
        }
        return -1;
    }
}
