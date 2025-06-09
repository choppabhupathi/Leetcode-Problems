class Solution {
    public int findTheWinner(int n, int k) {
        return findTheWinner0Based(n, k)+1;
    }
    
    public int findTheWinner0Based(int n, int k) {
        if(k == 1) return n-1;
        if(n == 1) return 0;
        if(k <= n) {
            return findTheWinnerForLargeN(n, k);
        } else {
            return findTheWinnerForSmallN(n, k);
        }
    }
    
    public int findTheWinnerForLargeN(int n, int k) {
        int np = n - (n/k);
        int result = (k*(((findTheWinner0Based(np, k) - n%k)+np) % np))/(k-1);
        return result;
    }
    
    public int findTheWinnerForSmallN(int n, int k) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            result = (result + k) % i;
        }
        return result;
    }
}