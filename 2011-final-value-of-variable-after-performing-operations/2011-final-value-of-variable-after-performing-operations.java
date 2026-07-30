class Solution {
    public int finalValueAfterOperations(String[] o) {
        int y=0;
        for(int i=0;i<o.length;i++){
            if(o[i].contains("+")){
                y=y+1;
            }
            else{
                y=y-1;
            }
        }
        return y;
    }
}