class Solution {
    public int countDigitOne(int n) {
        int cnt = 0;
        int base = 1;
        int numLower = 0;
        while(n > 0) //start from the least significant digit
        {
            int curr = n % 10;
            if(curr > 1) cnt += base;
            else if(curr == 1) cnt += numLower + 1;
            n /= 10;
            cnt += n * base; //add the higher digits (left of the current digit) multiplied by the base
            numLower += curr * base;
            base *= 10;
        }
        return cnt;
    }
}