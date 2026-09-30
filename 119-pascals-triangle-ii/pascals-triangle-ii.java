class Solution {

    static long ncr(int n, int r) {
        n = n - 1;
        r = r - 1;

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> ar = new ArrayList<>();

        for (int col = 0; col <= rowIndex; col++) {
            ar.add((int)ncr(rowIndex + 1, col + 1));
        }

        return ar;
    }
}