class Solution {
    public int diagonalSum(int[][] mat) {
      int m = mat.length;
    int n = mat[0].length;
    int sum =0;
    if(m%2!=0)
    {
      //int sum =0;
      for(int row=0;row<m;row++)
      {
          sum+=mat[row][row];
          sum+=mat[row][n-1-row];
      }
      sum=sum-mat[n/2][n/2];
    }
    else
    {
      //int sum =0;
      for(int row=0;row<m;row++)
      {
          sum+=mat[row][row];
          sum+=mat[row][n-1-row];
      }
      //sum=sum-mat[n/2][n/2];
    }
    return sum;
    //System.out.println(Sum);
  }
}