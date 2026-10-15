class Solution {
    public int minElement(int[] nums) {
        //ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int lar=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int digit=0;
            while(nums[i]>0)
            {
              digit=nums[i]%10;
              sum+=digit;
              nums[i]=nums[i]/10;
            }
            nums[i]=sum;
            if(nums[i]<lar)
            {
                lar=nums[i];
            }
        }
        return lar;
    }
}