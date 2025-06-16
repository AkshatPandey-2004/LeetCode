import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            if(map.containsKey(i)){
                arr.add(i);
                if(map.get(i)==1){
                    map.remove(i);
                }
                else{
                    map.put(i,map.get(i)-1);
                }
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<res.length;i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}