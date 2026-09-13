class Solution {
    public boolean containsDuplicate(int[] nums) {
         boolean ans= false;
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int num:nums)
         {
            map.put(num,map.getOrDefault(num, 0)+1);
         }
         for(int i:nums)
         {
            if(map.get(i)>1)
            {
                ans = true;
                return ans;
            }
         }
         return ans;
    }
}