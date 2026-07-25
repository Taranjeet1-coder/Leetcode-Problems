// class Solution {
//     public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//         int[][] ans = new int[rows * cols][2];
//         // East, South, West, North
//         int[] dr = {0, 1, 0, -1};
//         int[] dc = {1, 0, -1, 0};
//         int count = 0;
//         int dir = 0;
//         int step = 1;
//         ans[count++] = new int[]{rStart, cStart};
//         while (count < rows * cols) {
//             // Repeat twice because step length remains same
//             for (int k = 0; k < 2; k++) {
//                 for (int i = 0; i < step; i++) {
//                     rStart += dr[dir];
//                     cStart += dc[dir];
//                     if (rStart >= 0 && rStart < rows &&
//                         cStart >= 0 && cStart < cols) {
//                         ans[count][0] = rStart;
//                         ans[count][1] = cStart;
//                         count++;

//                         if (count == rows * cols)
//                             return ans;
//                     }
//                 }

//                 dir = (dir + 1) % 4;
//             }

//             step++;
//         }

//         return ans;
//     }
// }

// class Solution {
//     int ans = 0;
//     int[][] ansmat;

//     public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//         // 1. Fix: Initialize the matrix to hold coordinates [rows * cols][2]
//         ansmat = new int[rows * cols][2];

//         // Add the very first starting position
//         if (rStart < rows && cStart < cols && rStart >= 0 && cStart >= 0) {
//             ansmat[ans++] = new int[]{rStart, cStart};
//         } else {
//             // Even if out of bounds initially (though constraints say otherwise), 
//             // the problem implies tracking valid steps.
//             ansmat[ans++] = new int[]{rStart, cStart}; 
//         }

//         int edge = 1; // Tracks the step size for the current legs
        
//         while (ans < rows * cols) {
//             // Pass the current coordinates by reference-like behavior using an array
//             int[] coord = new int[]{rStart, cStart};
            
//             spiral(coord, edge, rows, cols);
            
//             // Extract the updated coordinates after one full spiral layer
//             rStart = coord[0];
//             cStart = coord[1];
            
//             // 2. Fix: The step size increments naturally as the spiral expands
//             edge += 2; 
//         }
//         return ansmat;
//     }

//     public void spiral(int[] coord, int edge, int n, int m) {
//         int r = coord[0];
//         int c = coord[1];

//         // The exact sequence of steps for a given layer:
//         int rightCount = edge;
//         int downCount = edge;
//         int leftCount = edge + 1;
//         int upCount = edge + 1;

//         // 1. Move RIGHT
//         while (rightCount != 0) {
//             c++; // Move right first
//             if (r < n && c < m && r >= 0 && c >= 0) {
//                 ansmat[ans++] = new int[]{r, c};
//             }
//             rightCount--;
//         }

//         // 2. Move DOWN
//         while (downCount != 0) {
//             r++; // Move down
//             if (r < n && c < m && r >= 0 && c >= 0) {
//                 ansmat[ans++] = new int[]{r, c};
//             }
//             downCount--;
//         }

//         // 3. Move LEFT
//         while (leftCount != 0) {
//             c--; // Move left
//             if (r < n && c < m && r >= 0 && c >= 0) {
//                 ansmat[ans++] = new int[]{r, c};
//             }
//             leftCount--;
//         }

//         // 4. Move UP
//         while (upCount != 0) {
//             r--; // Move up
//             if (r < n && c < m && r >= 0 && c >= 0) {
//                 ansmat[ans++] = new int[]{r, c};
//             }
//             upCount--;
//         }
//         // Update the coordinates back in the array so the main loop knows where we landed
//         coord[0] = r;
//         coord[1] = c;
//     }
// }

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];
        int[][] dir = {
            {0, 1},   // East
            {1, 0},   // South
            {0, -1},  // West
            {-1, 0}   // North
        };
        int index = 0;
        ans[index++] = new int[]{rStart, cStart};
        int steps = 1;
        while (index < rows * cols) {
            // East
            for (int i = 0; i < steps; i++) {
                cStart++;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[index++] = new int[]{rStart, cStart};
                }
            }
            // South
            for (int i = 0; i < steps; i++) {
                rStart++;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[index++] = new int[]{rStart, cStart};
                }
            }
            steps++;
            // West
            for (int i = 0; i < steps; i++) {
                cStart--;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[index++] = new int[]{rStart, cStart};
                }
            }
            // North
            for (int i = 0; i < steps; i++) {
                rStart--;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[index++] = new int[]{rStart, cStart};
                }
            }

            steps++;
        }
        return ans;
    }
}