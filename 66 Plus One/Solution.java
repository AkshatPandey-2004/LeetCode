class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        if(digits[0]==9){
            int[] arr=new int[digits.length+1];
            int ptr=digits.length;
            arr[ptr]=digits[digits.length-1]+1;
            carry=(arr[ptr--]==0)?1:0;
            for(int i=digits.length-2;i>=0;i--){
                arr[ptr--]=digits[i]+carry;
                carry=(digits[i]==0)?1:0;
            }
            return arr;
        }
        else{
            digits[digits.length-1]+=1;
            carry=(digits[digits.length-1]==0)?1:0;
            for(int i=digits.length-2;i>=0;i--){
                digits[i]+=carry;
                carry=(digits[i]==0)?1:0;
            }
        }


    }
}