import java.lang.Math;
class Solution {
    String[] unit=new String[]{"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
    String[] unit2=new String[]{"Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
    String[] unit3=new String[]{"Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
    public StringBuilder LastDigits3(int Number){
        String temp=String.valueOf(Number);
        StringBuilder s1=new StringBuilder(""); 
        int N=temp.length();
        int i;
        //if(Number==0){
               // s1=s1.append("Zero ");
                //break;
            //}
        for(i=N;i>0;i--){
            
            int b=Number/((int)Math.pow(10,i-1));
            Number=Number%((int)Math.pow(10,i-1));
            
            if(b==0){
                continue;
            }
            if(i==3){
                s1=s1.append(unit[b]);
                s1=s1.append("Hundred ");
            }
            if(i==2){
                if(b==1){
                    int c=Number%10;
                    s1=s1.append(unit2[c]);
                    break;
                }
                else{
                    s1=s1.append(unit3[b-2]);
                }
            }
            if(i==1){
                s1=s1.append(unit[b]);
            }
        }
        return s1;
    }
    public String numberToWords(int num) {
        
        //String[] unit4=new String[]{"Hundred","Thousand","Million","Billion"};
        String Num=String.valueOf(num);
        StringBuilder output=new StringBuilder("");
       
        int n=Num.length();
        int temp,a=num;
        Solution obj=new Solution();
        //Hundread=100=2 zero
        //Thousand=1000= 3 Zero-->5 Zero
        //Million=1000000= 6 zero -->8 Zero
        //Billion=1000000000= 10 zero
        if(num==0){
            return "Zero";
        }
        while(n>0){
            if(a==0){
                break;
            }
            if(n==10){
                temp=a/((int)Math.pow(10,9));
                a=a%((int)Math.pow(10,9));
                output.append(unit[temp]);
                output.append("Billion ");
                n--;
            }
            if(n<=9 && n>=7){
                StringBuilder s2=new StringBuilder("");
                temp=a/((int)Math.pow(10,6));
                a=a%((int)Math.pow(10,6));
                if(temp!=0){
                s2=obj.LastDigits3(temp);
                output.append(s2+"Million ");
                }
                n=6;
            }
            if(n<=6 && n>=4){
                StringBuilder s2=new StringBuilder("");
                temp=a/((int)Math.pow(10,3));
                
                if(temp!=0){
                    s2=obj.LastDigits3(temp);
                    output.append(s2+"Thousand ");
                }
                a=a%((int)Math.pow(10,3));
                n=3;
            }
            if(n<=3 && n>=1){
                StringBuilder s2=new StringBuilder("");
                if(a!=0){
                    s2=obj.LastDigits3(a);
                    output.append(s2);
                }
                n=0;
            }
            
        }
        //output=output.trim();
        return output.toString().trim();
        

        }
    
}
