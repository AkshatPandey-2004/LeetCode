class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixArr=new int[words.length];
        int[] ans=new int[queries.length];
        int i=0;
        int count=0;
        for(String str : words ){
            if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1))){
                count++;
            }
            prefixArr[i]=count;
            i++;
        }
        i=0;
        for(int[] arr: queries){
            if(arr[0]==0){
                ans[i]=prefixArr[arr[1]];
            }
            else{
                ans[i]=prefixArr[arr[1]]-prefixArr[arr[0]-1];
            }
            i++;
        }
        return ans;
    }
   private static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='i' || ch=='o' ||ch=='u'){
            return true;
        }
        return false;
    }
}
