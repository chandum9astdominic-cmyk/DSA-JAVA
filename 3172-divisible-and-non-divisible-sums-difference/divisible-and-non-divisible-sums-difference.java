class Solution {
    public int differenceOfSums(int n, int m) {
        int j=0;
        int k=0;
        ArrayList<Integer> ar = new ArrayList<>();
         ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                ar.add(i);
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                arr.add(i);
            }
        }
        for(int i:ar)
        {
            j+=i;
        }
         for(int i:arr)
        {
            k+=i;
        }
        return j-k;
    }
}