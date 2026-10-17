class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int freq=0;
        int dit=0;
        for(int num : nums)
        {
           
           while(num>0)
           {
            dit=num%10;
            if(dit==digit)
            {
                freq++;
            }
            num=num/10;
           }
        }
        return freq;
    }
}