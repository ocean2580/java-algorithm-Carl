package array.leetcode;

public class Matrix {
    public int[][] rotate(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int s = 0;  // 每次循环的开始点(s, s)
        int c = 1;  // 定义填充数字
        int i, j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = s; j < n - loop; j++) {
                res[s][j] = c++;
            }

            // 模拟右侧从上到下
            for (i = s; i < n - loop; i++) {
                res[i][j] = c++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = c++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = c++;
            }
            s++;
        }

        if (n % 2 == 1) {   // 奇数矩阵中心
            res[s][s] = c;
        }

        return res;
    }
}
