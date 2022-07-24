package hashtable.leetcode;

public class Anagram {
//    数组就是简单的哈希表，但是数组的大小可不是无限开辟的(固定)
    public boolean isAnagram(String s, String t) {

        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
