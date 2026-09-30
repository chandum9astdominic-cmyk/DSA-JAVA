class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left =0;
        int i=0;
        while(i<n)
        {
            if(nums[i]!=val)
            {
                nums[left]=nums[i];
                left++;
                i++;
            }
            else
            {
                i++;
            }
        
        }
        return left;
    }
}