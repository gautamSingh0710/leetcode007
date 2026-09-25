class RecentCounter {
    int s = 0;
    int[] A = new int[10001];

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        A[s] = t;
        s++;

        int count = 0;

        for(int i = 0; i < s; i++) {
            if(A[i] >= t - 3000) {
                count++;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */