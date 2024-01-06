class Solution {
    public int[] twoSum(int[] numbers, int target) {
       //target-x=y 
       //then binary Search for y in the array where first= (index of x) + 1
       //time complexity: O(n+logn)
       //May be Outer Loop will run from index=1 to (n+1)/2
       
       
       int[] output=new int[2];
       /*     MY 1st Approch   
       for(int i=0;i<numbers.length;i++){
           int y=target-numbers[i];
           int left=i+1;
           int right=numbers.length-1;
           //int middle=(left+right)/2;
           while(left<=right){
             int middle=(left+right)/2;
             if(y==numbers[middle]){
                 output[0]=i+1;
                 output[1]=middle+1;
                 break;
             }
             else if(y>numbers[middle]){
                 left=middle+1;
             }
             else{
                 right=middle-1;
             }  
           }
       }*/

       //My 2nd Approch
       int l=0;
       int r=numbers.length-1;
       while(l<=r){
           if(numbers[l]+numbers[r]>target){
               r--;
           }
           else if(numbers[l]+numbers[r]<target){
               l++;
           }
           else{
               output[0]=l+1;
               output[1]=r+1;
               break;
           }
       }
       return output;
    }
}
