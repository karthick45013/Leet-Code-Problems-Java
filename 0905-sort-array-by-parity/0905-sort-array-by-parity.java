class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ind=0;
        int temp[]= new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
             temp[ind]=nums[i];
                ind++;
            }
        }
        int c=ind;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                temp[c]=nums[i];
                c++;
            }
        }return temp;
    }
}