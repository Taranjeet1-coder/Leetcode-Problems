// class Solution {
//     public int lastRemaining(int n) {
//         int head=1;
//         int step=1;
//         int remaining=n;
//         boolean lefttoright = true;
//         while(remaining>1){
//             if(lefttoright || remaining%2==1){
//                 head+= step;
//             }
//             remaining/=2;
//             step*=2;
//             lefttoright = !lefttoright;
//         }
//         return head;
//     }
// }
class Solution {
    public int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * (n / 2 - lastRemaining(n / 2) + 1);
    }
}