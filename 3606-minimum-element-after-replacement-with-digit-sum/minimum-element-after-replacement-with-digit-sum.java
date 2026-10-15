class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int digit=0;
            while(nums[i]!=0)
            {
              digit=nums[i]%10;
              sum+=digit;
              nums[i]=nums[i]/10;
            }
            arr.add(sum);
        }
        int min = Integer.MAX_VALUE;
        for(int i: arr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }
}