class Solution {
    public int findNumbers(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
           int c=nums[i];
            while(c!=0)
            {
             c =c/10;
             a++;
            }
        
        if(a%2==0){
                b++;
            }
            a=0;

        }
        return b;
        
    }
}