// class Solution {
//     public int mirrorDistance(int n) {
//         int originalNumber = n;
//         int reverseNumber = 0;

//         while(n>0)
//         {
//             reverseNumber = reverseNumber*10 + n%10;
//             n /= 10; 
//         }
//         return reverseNumber > originalNumber ? reverseNumber - originalNumber : -1*(reverseNumber - originalNumber);
//     }
// }
class Solution {
    public int mirrorDistance(int n) {
        int x=n;
        int rev =0;
        while(n>0){
            rev= (rev*10)+(n%10);
            n/=10;
        }
        return Math.abs(x-rev);
    }
}