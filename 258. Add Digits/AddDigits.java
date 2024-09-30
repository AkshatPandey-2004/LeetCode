class Solution {
    public int addDigits(int num) {
       /*int n=Integer.toString(num).length();
       int sum=0;
       if(num>=0 && num<=9){
           return num;
       }
       for(int i=0;i<n;i++){
           sum+=num%10;
           num/=10;
           if(sum/10==1){
               sum+=sum/10;
               sum%=10;
           }
       }
       return sum; 
    }*/
//attempt 2
    if(num%9!=0 || num==0){
        return num%9;
    }
    else{
        return 9;
    }
}
}
