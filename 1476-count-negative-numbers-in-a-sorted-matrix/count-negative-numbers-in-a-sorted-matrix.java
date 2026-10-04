class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int count=0;
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<grid[row].length;col++)
            {
                if(grid[row][col]<0)
                {
                    count++;
                }
            }
        }
     return count;
    }
}