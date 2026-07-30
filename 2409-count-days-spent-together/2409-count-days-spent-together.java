class Solution {
    public int daysofdate(String date){
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3));
        int total= day;
        for(int i=0;i<month -1;i++){
            total+= days[i];
        }
        return total;
    }
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
        int astart= daysofdate(aA);
        int aend= daysofdate(lA);
        int bstart= daysofdate(aB);
        int bend= daysofdate(lB);
        int start= Math.max(astart, bstart);
        int end= Math.min(aend,bend);
        return Math.max(0,end-start+1);
    }
}