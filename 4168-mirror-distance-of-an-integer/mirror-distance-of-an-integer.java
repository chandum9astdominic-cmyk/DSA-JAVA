class Solution {
    public int mirrorDistance(int n) {
       int digit=0;
       int temp=n;
       int ans =0;
       while(n!=0)
       {
        digit=n%10;
         ans = ans*10+digit;
         n=n/10;
       }
       return Math.abs(temp-ans);

    }
}