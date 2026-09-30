class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int start =0;
       int i=0;
       while(i<n)
       {
        if(nums[i]!=0)
        {
           int temp = nums[i];
           nums[i]= nums[start];
           nums[start]= temp;
           start++;
        }
        i++;
       }
    }
}