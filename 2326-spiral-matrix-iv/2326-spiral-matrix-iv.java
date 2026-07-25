/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][];
        for (int i = 0; i < m; i++) {
            matrix[i] = new int [n];
            Arrays.fill(matrix[i], -1);
        }
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while(head != null){
            for(int col = left; col <= right && head != null; col++, head = head.next ){
                matrix[top][col] = head.val;
            }
            top++;

            for(int row = top; row<=bottom && head != null; row++, head = head.next){
                matrix[row][right] = head.val;
            }
            right--;

            for(int col = right; col>=left && head != null; col--, head = head.next){
                matrix[bottom][col] = head.val;
            }
            bottom--;

            for(int row = bottom; row>=top && head != null; row--, head = head.next){
                matrix[row][left] = head.val;
            }
            left++;
        }
        return matrix;
    }
}