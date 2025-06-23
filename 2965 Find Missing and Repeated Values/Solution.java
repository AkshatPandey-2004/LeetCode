import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int actual_sum=0,count=1;
        int grid_sum=0;
        HashSet<Integer> set=new HashSet<>();
        int arr[] =new int[2];
        for (int[] grid1 : grid) {
            for (int j = 0; j < grid1.length; j++) {
                actual_sum+=count++;
                if (set.contains(grid1[j])) {
                    arr[0] = grid1[j];
                    continue;
                } else {
                    set.add(grid1[j]);
                }
                grid_sum += grid1[j];
            }
        }
        arr[1]=actual_sum-grid_sum;
        return arr;
    }
}