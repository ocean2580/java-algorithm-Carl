package hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoNum {
    // HashMap
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2]; // 结果
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];    // 目标补数
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);    // 存入map: 数组值做key, 下标做value（value会被覆盖）
        }
        System.out.println(map);
        return res;
    }
}
