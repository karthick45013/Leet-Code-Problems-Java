class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String b="";
            b=b+x;
            if(words[i].contains(b)){
                a.add(i);
            }
        }
        return a;
    }
}