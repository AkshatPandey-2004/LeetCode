import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int actual_sum=0,count=1;
        int grid_sum=0;
        HashSet<Integer> set=new HashSet<>();
        int arr[] =new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                actual_sum+=count++;
                if(set.contains(grid[i][j])){
                    arr[0]=grid[i][j];
                    continue;
                }
                else{
                    set.add(grid[i][j]);
                }
                grid_sum+=grid[i][j];
                
            }
        }
        arr[1]=actual_sum-grid_sum;
        return arr;
    }
}