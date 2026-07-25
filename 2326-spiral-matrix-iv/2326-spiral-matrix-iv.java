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
    public int[][] spiralMatrix(int m, int n, ListNode temp) {
        int [][]arr= new int[m][n];
        ListNode head= temp;
        int top=0,left=0;
        int bottom=m-1, right=n-1;
        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);
        }
        while(head!= null && top<=bottom && left<=right){
            for(int i=left;i<=right && head!= null;i++){
                arr[top][i]= head.val;
                head= head.next;
            }
            top++;
            for(int i=top;i<=bottom && head!= null;i++){
                arr[i][right]= head.val;
                head= head.next;
            }
            right--;
            for(int i=right;i>=left && head!= null;i--){
                arr[bottom][i]= head.val;
                head= head.next;
            }
            bottom--;
            for(int i=bottom;i>=top && head!= null;i--){
                arr[i][left]= head.val;
                head= head.next;
            }
            left++;
        }
        return arr;
    }
}