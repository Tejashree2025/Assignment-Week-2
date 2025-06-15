class Solution {
    public static void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
         int max_index=n-1;
         int min_index=0;
          int maxElem = arr[n - 1] + 1;
        
        for(int i=0;i<n;i++){
            
            if(i%2==0){
                 arr[i] = arr[i] + (arr[max_index] % maxElem) * maxElem;
          max_index--;
            }else{
             arr[i] = arr[i] + (arr[min_index] % maxElem) * maxElem;
          min_index++;
            
            }
            
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }
}
