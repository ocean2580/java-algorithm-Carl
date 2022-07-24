package array.leetcode;
// https://leetcode.cn/problems/remove-element/

public class MoveElement {
    public int removeElement(int[] nums, int val) {
        // 快慢指针，相对运动
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
}
