// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int count=0;
        int windowSize=0;
        int min=Integer.MAX_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
        
             
              if(arr[i]<=k){
                  windowSize++;
              }
        }
        for(int i=0;i<windowSize;i++){
              if(arr[i]>k){
                  count++;
                  
              }
        }
        min=count;
              
           for (int i = 1; i <= arr.length - windowSize; i++){
               
           if(arr[i-1]>k){
           count--;
           }
          if(arr[i + windowSize - 1] > k){
               count++;
                
              
           }
           min=Math.min(min, count);
              
              
        }
        return min;
    }
}

