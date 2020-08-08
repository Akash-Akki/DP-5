//Time Complexity : O(m*n)
//Space Complexity : O(m*n)
//Did it run on leet code  : yes

//The main approach here is to check how many options are available at that position and depend on that starting building a dp array.
class Solution {
    public int uniquePaths(int m, int n) {
    
        int[][] dp = new int[m+1][n+1];  
        for(int i = 1 ; i < dp.length ;i++){
            for(int j = 1; j < dp[0].length; j++){
                if(i == 1 || j == 1)
                    dp[i][j] = 1;
                else
                 dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
          return dp[dp.length-1][dp[0].length-1];
    }
}