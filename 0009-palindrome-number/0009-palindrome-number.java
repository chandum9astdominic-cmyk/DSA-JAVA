class Solution {
    public boolean isPalindrome(int x) {
        boolean pali = false;
        int rev=0;
        int digit=0;
        int temp=x;
        if(x<0)
        {
            return pali;
        }
        while(x!=0)
        {
            //last digit
             digit=x%10;
            //remove the last digit
            x=x/10;
            //reverse num
            rev=rev*10+digit; 
        }
        if(temp==rev)
        {
             pali = true;
             return pali;
        }
        return pali;
    }
}