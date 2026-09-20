class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int hf=Integer.MIN_VALUE;
        int hfkey = 0;
        for(int i =0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        for( int key : map.keySet())
        {
            if(map.get(key)>hf)
            {
                hf=map.get(key);
                hfkey = key;
            }
        }
        return hfkey;

    }
}