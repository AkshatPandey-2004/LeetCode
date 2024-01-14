class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
        }/*
        else if(digits[0]==9){
            int[] digit=new int[digits.length+1];
            digit[0]=1;
            return digit;
        }
        else{
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){ digits[i]=0;}
                else{digits[i]+=1;break;}
            }
        }*/
        else{
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){ digits[i]=0;}
                else{digits[i]+=1;break;}
            }
            if(digits[0]==0){
                int[] digit=new int[digits.length+1];
                digit[0]=1;
                return digit;
            }
        }
        return digits;
    }
}
