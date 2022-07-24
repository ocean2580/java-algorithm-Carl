package ocean.hashtable.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
// 如果哈希值比较少、特别分散、跨度非常大，使用数组就造成空间的极大浪费！
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];  // []
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        // 遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        // 遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }
        // 将结果几何转为数组
        return resSet.stream().mapToInt(a -> a).toArray();
    }
}
