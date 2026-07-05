class Solution {
public:
    int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int x=low;x<=high;x++){
            if(x>=10 && x<=99){
                if(x/10 == x%10) ans++;
            } else if((x>=1000 && x<=9999)){
                int a=x/1000;
                int b=(x/100)%10;
                int c=(x/10)%10;
                int d=x%10;
                if(a+b == c+d) ans++;
            }
        }
        return ans;
    }
};