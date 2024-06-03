class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        //boolean endloop=false;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return t.length()-i;
}
}
