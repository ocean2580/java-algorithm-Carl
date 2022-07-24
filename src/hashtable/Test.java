package hashtable;

import hashtable.leetcode.*;

import java.util.Arrays;

public class Test {

    public static void t1() {
        String s = "abab";
        String t = "aabb";

        Anagram a = new Anagram();
        System.out.println(a.isAnagram(s, t) ? "yes" : "no");
    }

    public static void t2() {
        int[] a = {1, 2, 3, 3, 2};
        int[] b = {1, 3, 3};

        Intersection i = new Intersection();
        System.out.println(Arrays.toString(i.intersection(a, b)));
    }

    public static void t3() {
        int n = 21; // false
        int m = 19; // true

        HappyNum h = new HappyNum();
        System.out.println(h.isHappy(n));
    }

    public static void t4() {
        int[] nums = {3, 2, 1, 1};
        int target = 4;

        TwoNum t = new TwoNum();
        System.out.println(Arrays.toString(t.twoSum(nums, target)));
    }

    public static void t5() {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        FourNumA f = new FourNumA();
        System.out.println(f.fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static void t6() {
        String ransomNote = "help";
        String magazine = "hellophp";

        Ransom r = new Ransom();
        System.out.println(r.canConstruct(ransomNote, magazine) ? "yes" : "no");
    }

    public static void t7() {
        int[] nums = {-1, 0, 1, 2, -1, 0};

        ThreeNum t = new ThreeNum();
        System.out.println(t.threeSum(nums));
    }

    public static void t8() {
        int[] nums = {1, 0, -1, 0, -2, 2, 0};
        int target =  1;

        FourNumB f = new FourNumB();
        System.out.println(f.fourSum(nums,target));
    }

    public static void main(String[] args) {
        t8();
    }
}
