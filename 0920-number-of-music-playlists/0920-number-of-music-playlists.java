class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        
        long MOD = 1000000007;
        
        long[][] dp = new long[goal + 1][n + 1];
        
        // 0 length playlist aur 0 songs
        dp[0][0] = 1;
        
        for (int i = 0; i < goal; i++) {
            
            for (int j = 0; j <= n; j++) {
                
                // Case 1: New song add
                if (j < n) {
                    dp[i + 1][j + 1] += dp[i][j] * (n - j);
                    dp[i + 1][j + 1] %= MOD;
                }
                
                // Case 2: Old song repeat
                if (j > k) {
                    dp[i + 1][j] += dp[i][j] * (j - k);
                    dp[i + 1][j] %= MOD;
                }
            }
        }
        
        return (int) dp[goal][n];
    }
}