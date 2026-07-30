class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if(f.length==1&&f[0]==0){
            f[0]=1;
            return true;
        }
        int c=0;
        int c1=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==1){
                c++;
            }
        }
        if(f[0]==0&&f[1]==0){
            f[0]=1;
        }
        for(int i=1;i<f.length-1;i++){
            if(f[i-1]==f[i]&&f[i]==f[i+1]){
                f[i]=1;
            }
        }
        if(f[f.length-1]==0&&f[f.length-2]==0){
            f[f.length-1]=1;
        }
        for(int i=0;i<f.length;i++){
             if(f[i]==1){
                c1++;
            }
            System.out.print(f[i]);
        }
        if((c1-c)>=n){
            return true;
        }
        return false;
    }
}