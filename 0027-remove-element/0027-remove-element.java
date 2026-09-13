class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0;
        int value=val;
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=value)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}