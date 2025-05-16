class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean []row =new boolean[n];
        boolean []col=new boolean[m];
		
	
        for(int i=0;i<indices.length;i++){
            int a=indices[i][0];
            int b=indices[i][1];
            row[a]=!row[a];
            col[b]=!col[b];
        }
		
        int rowEven=0;
        int colEven=0;
        int rowOdd=0;
        int colOdd=0;
		
		
        for(int i=0;i<n;i++){
            if(row[i]==true)
                rowOdd++;
            else
                rowEven++;
        }
		
	
        for(int j=0;j<m;j++){
            if(col[j]==true)
                colOdd++;
            else
                colEven++;
        }
		
		
        return rowEven*colOdd+rowOdd*colEven;
    }
}