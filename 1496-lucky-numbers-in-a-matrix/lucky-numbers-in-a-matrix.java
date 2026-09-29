class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ar = new ArrayList<>();

            int m = matrix.length;
            int n = matrix[0].length;
            int currentindexmin=0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

        for (int row = 0; row < m; row++) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for (int col = 0; col < n; col++) {
                 // find the minimun in the array;
                 //int min = Integer.MAX_VALUE;
                if (matrix[row][col]<min) 
                {
                    min = matrix[row][col];
                    currentindexmin=col;
                    //System.out.println(min);
                }
              }
                for(int i=0;i<m;i++)
                {
                  if(matrix[i][currentindexmin]>max)
                  {
                    max=matrix[i][currentindexmin];
                    //System.out.println(max);
                  }
                }
            if(max==min)
              {
                ar.add(max);
                //return ar;
              }
            }
            // Add only the final minimum of the row
         
            //ar.add(min)
            return ar;
        }

}