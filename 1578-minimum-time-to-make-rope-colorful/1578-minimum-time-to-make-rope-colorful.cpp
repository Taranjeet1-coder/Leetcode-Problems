// class Solution {
// public:
//     int minCost(string col, vector<int>& time) {
//         int sum=0;
//         int maxi= time[0];
//         for(int i=1;i<col.size();i++){
//             if(col[i] == col[i-1]){
//                 sum+= min(maxi, time[i]);
//                 maxi= max(maxi, time[i]);
//             } else{
//                 maxi= time[i];
//             }
//         }
//         return sum;
//     }
// };
class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) 
    {
     int totaltime=0;
     for(int i=1;i<colors.size();i++) 
     {
       if(colors[i-1]==colors[i])
       {
        if(neededTime[i]<neededTime[i-1])
        {
         totaltime=totaltime+neededTime[i];
         neededTime[i]=neededTime[i-1];
        }
        else
        {
         totaltime=totaltime+neededTime[i-1];
         neededTime[i-1]=neededTime[i];
        }
       }
     }
     return totaltime;
    }
};