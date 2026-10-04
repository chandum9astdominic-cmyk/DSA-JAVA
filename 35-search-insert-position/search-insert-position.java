class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start =0;
        int end =n-1;
        int mid=0;
        while(start<=end)
        {
             mid=(start+(end-start)/2);
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        if(nums[mid]>target)
        {
           return start;
        }
        else if(nums[mid]<target)
        {
            return mid+1;
        }
      return -1;
    }
}