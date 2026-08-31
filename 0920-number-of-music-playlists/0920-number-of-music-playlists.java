class Solution {
    
    int goal, n, k;
    long MOD = 1_000_000_007;
    long[][] dp;

    public int numMusicPlaylists(int n, int goal, int k) {
        
        this.n = n;
        this.goal = goal;
        this.k = k;

        dp = new long[goal + 1][n + 1];

        // Initialize with -1
        for (int i = 0; i <= goal; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return (int) solve(0, 0);
    }


    private long solve(int length, int uniqueSongs) {

        if (length == goal) {
            return uniqueSongs == n ? 1 : 0;
        }


        if (dp[length][uniqueSongs] != -1) {
            return dp[length][uniqueSongs];
        }


        long ways = 0;

        // New song
        if (uniqueSongs < n) {
            ways += (n - uniqueSongs) 
                    * solve(length + 1, uniqueSongs + 1);

            ways %= MOD;
        }


        // Old song
        if (uniqueSongs > k) {
            ways += (uniqueSongs - k) 
                    * solve(length + 1, uniqueSongs);

            ways %= MOD;
        }


        return dp[length][uniqueSongs] = ways;
    }
}