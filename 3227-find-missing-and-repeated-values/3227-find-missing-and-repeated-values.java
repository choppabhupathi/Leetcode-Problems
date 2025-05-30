class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int xor = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                xor ^= arr[i][j];
                xor ^= index++ + 1;
            }
        }

        int bit = 0;

        while (true) {
            if ((xor & (1 << bit)) != 0) {
                break;
            }
            bit++;
        }

        long zero = 0;
        long one = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i][j] & (1 << bit)) != 0) {
                    one ^= arr[i][j];
                } else {
                    zero ^= arr[i][j];
                }
            }
        }

        for (int i = 1; i <= arr.length * arr.length; i++) {
            if ((i & (1 << bit)) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr.length; j++){
                if (arr[i][j] == one) {
                    count++;
                }
            }
        }

        if (count == 2)
            return new int[] { (int) one, (int) zero };
        else
            return new int[] { (int) zero, (int) one };
    }
}