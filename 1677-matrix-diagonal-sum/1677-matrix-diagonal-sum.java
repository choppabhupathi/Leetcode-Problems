class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int sum=0;
        for(int row=0;row<rows;row++){
            
                sum +=mat[row][row];
                sum +=mat[row][rows-1-row];

            }
        
        if(rows%2 !=0){
            sum -= mat[rows/2][rows/2];
        }
        return sum;
        
    }
}