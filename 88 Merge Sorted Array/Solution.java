class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
       int arr[] =new int[m+n];
       int i=0,j=0,k=0;
       while(i<m && j<n){
            if(num1[i]<=num2[j]){
                arr[k]=num1[i];
                k++;
                i++;
            }     
            else if(num1[i]>num2[j]){
                arr[k]=num2[j];
                k++;
                j++;
            }
       }
       while(i<m){
            arr[k++]=num1[i++];
       }
       while(j<n){
        arr[k++]=num2[j++];
       }
       for(int l=0;l<num1.length;l++){
            num1[l]=arr[l];
       }
    }
}