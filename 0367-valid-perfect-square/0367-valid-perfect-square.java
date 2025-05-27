class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = (left + right)/2;
            long midSquare = (long) mid * mid;
            if (midSquare == num) return true;
            else if (midSquare > num) right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return false;
    }
}