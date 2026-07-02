class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> freq;
        for(char i:s){
            freq[i]++;
        }
        int count=0;
        bool odd=false;
        for(auto x: freq){
            if(x.second%2==0){
                count+=x.second;
            } else if(x.second%2==1) {
                count+=x.second-1;
                odd=true;
                // odd= true;
            }
        }
        if(odd){
            count++;
        }
        return count;
    }
};