class Solution {
    public boolean isPalindrome(int x) {
        int rem=x;int rev=0;
        while(rem>0)
        {
            int r=rem%10;
            rem=rem/10;
            rev=rev*10+r;
        }
        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}