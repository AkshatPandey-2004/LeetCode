class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                count+=2;
                map.remove(s.charAt(i));
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        if(map.containsValue(1)){
            count+=1;
        }
        
        return count;
    }
}
