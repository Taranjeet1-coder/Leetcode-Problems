// class Solution {
// public:
//     vector<int> distinctDifferenceArray(vector<int>& nums) {
//         int n=  nums.size();
//         vector<int> prefix(n), suffix(n), ans(n);
//         unordered_set<int> st;
//         for(int i=0;i<n;i++){
//             st.insert(nums[i]);
//             prefix[i]= st.size();
//         }
//         st.clear();
//         for(int i=n-1;i>=0;i--){            
//             suffix[i]= st.size();
//             st.insert(nums[i]);
//         }
//         for(int i=0;i<n;i++){
//             ans[i] = prefix[i]- suffix[i];
//         }
//         return ans;
//     }
// };

class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        int histo[51] = {0};
        int leftHisto[51] = {0};
        int rightDistinct = 0;
        int leftDistinct = 0;
        vector<int> diff(nums.size(), 0);
        // populate histogram
        for (const int &n : nums) {
            if (histo[n] == 0)
                ++rightDistinct;
            ++histo[n];
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (leftHisto[nums[i]] == 0) {
                ++leftDistinct;
            }
            ++leftHisto[nums[i]];
            --histo[nums[i]];
            if (histo[nums[i]] == 0) {
                --rightDistinct;
            }
            diff[i] = leftDistinct - rightDistinct;
        }
        return diff;
    }
};