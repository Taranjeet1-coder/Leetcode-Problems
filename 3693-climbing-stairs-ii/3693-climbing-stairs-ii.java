class Solution {
    public int climbStairs(int n, int[] costs) {
        int a = Integer.MAX_VALUE >> 1, b = Integer.MAX_VALUE >> 1, c = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = costs[i - 1] + Math.min(1 + c, Math.min(4 + b, 9 + a));
            a = b;
            b = c;
            c = tmp;
        }
        return c;
    }
}