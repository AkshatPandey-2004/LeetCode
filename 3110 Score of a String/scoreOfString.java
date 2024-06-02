class Solution {
    public int scoreOfString(String s) {
        int count=0;
        for(int i=0; i<s.length()-1;i++){
            char cur=s.charAt(i);
            char nxt=s.charAt(i+1);
            int acur=(int) cur;
            int anxt=(int) nxt;
            int sub=acur-anxt;
            if(sub>0){
                count+=sub;
            }
            else{
                sub*=-1;
                count+=sub;
            }
        }
        return count;
    }
}
