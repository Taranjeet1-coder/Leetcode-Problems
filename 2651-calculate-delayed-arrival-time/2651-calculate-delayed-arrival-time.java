class Solution {
    public int findDelayedArrivalTime(int at, int dt) {
        int sum= at+dt;
        if(sum==24 ){
            return 0;
        }
        if(sum>24){
            return sum%24;
        }
        return sum;
    }
}