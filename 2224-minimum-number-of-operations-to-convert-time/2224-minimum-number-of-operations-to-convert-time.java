class Solution {
    public int convertTime(String current, String correct) {
        int currentmin= Integer.parseInt(current.substring(0,2))* 60 + Integer.parseInt(current.substring(3));
        int correctmin= Integer.parseInt(correct.substring(0,2)) * 60 + Integer.parseInt(correct.substring(3));
        int diff = correctmin - currentmin;
        int count=0;
        int steps[]= {60,15,5,1};
        for(int step:steps){
            count += diff/step;
            diff%=step;
        }
        return count;
    }
}