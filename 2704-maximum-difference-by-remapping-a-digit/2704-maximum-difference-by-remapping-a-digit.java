class Solution {
    public int minMaxDifference(int num) {
        char a[]=String.valueOf(num).toCharArray();
        char b[]=String.valueOf(num).toCharArray();
        char x=a[0],y=a[0];
        for(int i=0;i< a.length;i++){
            if(a[i]!='9'){
                x=a[i];
                break;
            }

        }
        for(int  i=0;i<a.length;i++){
            if(a[i]==x){
                a[i]='9';
            }
        }
        for(int i=0;i<a.length;i++){
            if(b[i]==y){
                b[i]='0';

            }
        }
        return Integer.parseInt(String.valueOf(a)) - Integer.parseInt(String.valueOf(b));
    }
}