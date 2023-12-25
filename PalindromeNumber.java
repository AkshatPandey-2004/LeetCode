import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        else if(x>=0 && x<=9){
            return true;
        }
        else{
            String s= String.valueOf(x);
            int n=s.length();
            int a=x;
            int output=0;
            for(int i=n-1;i>=0;i--){
                int rem;
                rem=a%10;
                a=a/10;
                output+=rem*((int)Math.pow(10,i));
            }
            if(x==output){
                return true;
            }
            else{
                return false;
            }

        }
    }
}
