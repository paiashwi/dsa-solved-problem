import java.util.*;
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        //int arr[]=new int[n];
        int sum=0;
        int max=Integer.MIN_VALUE;
        // Your code here
        for(int i=0;i<n;i++)
        {
           if(sum<0){
               sum=arr[i];
           }
           else{
               sum+=arr[i];
           }
           max=Math.max(max,sum);
        }
        
   return max;
    }
    
}
