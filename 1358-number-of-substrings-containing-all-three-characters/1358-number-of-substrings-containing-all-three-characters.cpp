class Solution {
public:
    int numberOfSubstrings(string s) {
        int lasta=-1;
        int lastb=-1;
        int lastc=-1;
        int ans=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='a'){
                lasta=i;
            } else if(s[i]=='b'){
                lastb=i;
            }else if(s[i]=='c'){
                lastc=i;
            }

            int mini= min(lasta,min(lastb,lastc));
            if(mini!=-1){
                ans += mini +1;
            }
        }
        return ans;
    }
}; 