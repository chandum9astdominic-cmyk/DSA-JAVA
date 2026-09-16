class Solution {
    public void moveZeroes(int[] nums) {
        int temp[]=new int[nums.length];
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                temp[j++]=nums[i];
            }
            else if(nums[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            nums[i]=temp[i];
        }
        for(int i =temp.length-1;i<nums.length-1;i++)
        {
              nums[i]=0;
        }
    }
}