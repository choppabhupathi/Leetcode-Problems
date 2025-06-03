class Solution {
    static final long MOD = 1_000_000_007;

    public long myPow(long x, long n, long mod) {
        long ans = 1;
        x %= mod;
        while(n > 0){
            if(n%2 != 0){
                ans = (ans * x) % mod;
            }
            x = (x * x) % mod;
            n = n/2;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
        return (int) ((myPow(5, n/2 + n%2, MOD) * myPow(4, n/2, MOD) % MOD));
    }
}