class Solution {
    public void setZeroes(int[][] matrix) {
        var R = matrix.length;
        var C = matrix[0].length;
        var firstColZero = false;

        for (var i = 0; i < R; i++) {
            if (matrix[i][0] == 0) firstColZero = true;
            for (var j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (var i = R - 1; i >= 0; i--) {
            for (var j = C - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (firstColZero) {
                matrix[i][0] = 0;
            }
        }
    }
}