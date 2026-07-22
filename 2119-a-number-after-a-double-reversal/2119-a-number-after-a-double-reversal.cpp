class Solution {
public:
    bool isSameAfterReversals(int num) {
        int nums= num;
        int n;
        int r=0;
        while(nums>0){
            n= nums%10;
            r= r*10 + n;
            nums/=10;
        }
        while(r>0){
            n= r%10;
            nums= nums*10 + n;
            r/=10;
        }
        if(num== nums){
            return true;
        }
        return false;
    }
};