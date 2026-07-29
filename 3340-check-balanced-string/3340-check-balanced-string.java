class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0,d=0;
        for(int i=0;i<num.length();i++)
        {
           d=num.charAt(i)-'0';
           if(i%2==0)
           {
            even+=d;
           }
           else
           odd+=d;
        }
        return even==odd;
    }
}