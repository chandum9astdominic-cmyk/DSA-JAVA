class Solution {
    public int maxArea(int[] height) {
       int n= height.length;
        int left = 0;
        int right =n-1;
        int water =0;
        int max = Integer.MIN_VALUE;
        while (left<=right) {

            water=(right-left)*Math.min(height[left], height[right]);
            if(water>max)
            {
                max=water;
            }
            else if(height[left]<height[right])
            {
                left++;
            }
             else if(height[left]>height[right])
            {
                right--;
            }
            else if(height[left]==height[right])
            {
                left++;
                right--;
            }
        }
        return max; 
    }
}