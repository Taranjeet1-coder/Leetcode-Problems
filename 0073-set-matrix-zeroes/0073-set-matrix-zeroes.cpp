class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int rows= matrix.size();
        int cols= matrix[0].size();
        bool r[200]= {false};
        bool c[200]= {false};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    r[i] = true;
                    c[j]= true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(r[i] || c[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                cout<<matrix[i][j]<<" ";
            }
            cout<<endl;
        }
    }
};