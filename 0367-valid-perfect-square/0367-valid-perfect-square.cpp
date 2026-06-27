class Solution {
public:
    bool isPerfectSquare(int x) {
        if(x<1) return false;
        int low=1;
        int high=x;
        while(low<=high){
            int mid = low + (high -low)/2;
            long long sq= 1LL * mid * mid;
            if(sq==x) return true;
            else if(sq<x){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return false;
    }
};