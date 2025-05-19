class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;

        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=m-1,k=0;j>=0 && k<=m;j--,k++){
              if(image[i][j]==0){
                arr[i][k]=1;
             }
             else{
                arr[i][k]=0;
             }
            }
            
        }
        
        
        return arr;
    }
}