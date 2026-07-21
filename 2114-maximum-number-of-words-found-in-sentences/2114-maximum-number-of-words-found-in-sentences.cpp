class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int ans= 0;
        for(const string &s: sentences){
            int word=1;
            int n= s.size();
            for(int i=0;i<n;i++){
                if(s[i]==' '){
                    word++;
                }
            }
            ans= max(ans,word);
        }
        return ans;
    }
};