class Solution {
    public int scoreOfString(String s) {
        int s1=0;
        int m=0;
        for(int i=0;i<s.length()-1;i++){
          m=(char) s.charAt(i)-s.charAt(i+1);
          s1=s1+Math.abs(m);
        }
        return s1;
    }
}