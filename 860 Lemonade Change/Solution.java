class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0,tens=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fives++;
            }
            else if(bills[i]==10 && fives>0){
                fives--;
                tens++;
            }
            else if(bills[i]==20 && fives > 0 && tens>0){
                tens--;
                fives--;
            }
            else if(bills[i]==20 && fives >= 3){
                fives-=3;
            }
            else{
                return false;
            }
        }
        return true;
    }
}