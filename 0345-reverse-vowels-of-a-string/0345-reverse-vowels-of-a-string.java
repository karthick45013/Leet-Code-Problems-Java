class Solution {
    public String reverseVowels(String s) {
        List<Character>a=new ArrayList<>();
        String c="";
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                a.add(b);
            }
        }
        Collections.reverse(a);
        int k=0;
for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                c=c+a.get(k);
                k++;
            }
            else{
                c=c+b;
            }
        }
        return c;
    }
}