class Solution {
public:
    int minCost(string col, vector<int>& time) {
        int sum=0;
        int maxi= time[0];
        for(int i=1;i<col.size();i++){
            if(col[i] == col[i-1]){
                sum+= min(maxi, time[i]);
                maxi= max(maxi, time[i]);
            } else{
                maxi= time[i];
            }
        }
        return sum;
    }
};