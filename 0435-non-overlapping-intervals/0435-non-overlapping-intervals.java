class Solution {
    public int eraseOverlapIntervals(int[][] val) {
        Arrays.sort(val, (a,b) -> Integer.compare(a[1],b[1]));
        int count=0;
        int last= val[0][1];
        for(int i=0;i<val.length;i++){
            if(val[i][0] >= last){
                last= val[i][1]; 
            } else{
                count++;
            }
        }
        return --count;
    }
}