class Solution {
public:
    vector<int> plusOne(vector<int>& digit) {
        int n= digit.size();
        for(int i=n-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]+=1;
                return digit;
            }
            digit[i] = 0;
            
        }
        vector<int> ans(n+1,0);
        ans[0] =1;
        return ans;
    }
};