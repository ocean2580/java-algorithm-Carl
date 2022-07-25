package string;

import string.leetcode.ReplaceSpace;
import string.leetcode.ReverseA;
import string.leetcode.ReverseLeftWords;

public class Test {
    public static void main(String[] args) {
        t3();
    }

    public static void t1() {
        char[] s = {'h', 'l', 'l', 'o'};
        ReverseA r = new ReverseA();

        r.reverseString(s);
        System.out.println(s);
    }

    public static void t2() {
        String s = "h e l l o";
        ReplaceSpace r = new ReplaceSpace();

        System.out.println(r.replaceSpaceA(s));
        System.out.println(r.replaceSpaceB(s));
    }

    public static void t3() {
        String s = "hello!";
        int n = 2;
        ReverseLeftWords r = new ReverseLeftWords();

        System.out.println(r.reverseLeftWords(s, n));
    }
}
