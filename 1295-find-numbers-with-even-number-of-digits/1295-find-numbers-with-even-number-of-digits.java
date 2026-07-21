class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++){
            if((int)((Math.log10(nums[i]))+1) % 2 == 0){
                result++;
            }
        }
        return result;
    }
}


// class Solution {
//     public int findNumbers(int[] nums) {
//         int ans= 0;
//         for(int x: nums){
//             if((x>=10 && x<=99) || (x>=1000 && x<=9999) || (x== 100000)){
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }