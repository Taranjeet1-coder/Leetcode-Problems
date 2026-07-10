class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> arr;
        int total = 1<<n;
        for(int i=0;i<total;i++){
            arr.push_back(i^(i>>1));
        }
        return arr;
    }
};