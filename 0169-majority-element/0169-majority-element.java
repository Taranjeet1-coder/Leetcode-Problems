class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int counter=0;
        int majority= -1;
        for(int i=0;i<n;i++){
            if(counter==0){
                majority= nums[i];
                // counter++;
            }
            if(majority == nums[i]){
                counter++;
            } else {
                counter--;
            }
        }
        return majority;
    }
}