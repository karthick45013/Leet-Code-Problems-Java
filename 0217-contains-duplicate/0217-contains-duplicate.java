class Solution {
    public boolean containsDuplicate(int[] a) {
        boolean b= true ;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                return b;
            }
        }
        return false;
    }
}