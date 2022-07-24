package ocean.hashtable.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) { // 要么为1，要么无限循环且永不为1
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;  // 个位
            res += temp * temp;
            n = n / 10; // 缩
        }
        return res;
    }
}
