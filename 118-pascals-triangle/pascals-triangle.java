class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> current = new ArrayList<>();

            for (int col = 0; col <= row; col++) {

                if (col == 0 || col == row) {
                    current.add(1);
                } else {
                    int value = ans.get(row - 1).get(col - 1)
                              + ans.get(row - 1).get(col);

                    current.add(value);
                }
            }

            ans.add(current);
        }

        return ans;
    }
}