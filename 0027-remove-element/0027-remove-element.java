class Solution {
    public int removeElement(int[] n, int v) {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=v)
            {
                n[c]=n[i];
                c++;
            }
        }return c;
    }
}