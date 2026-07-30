class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int a=0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }else
            {
                if(a<count){
                    a=count;
                }
                count=0;
            }
            if(a<count){
                    a=count;
                }
        }return a;
    }
}