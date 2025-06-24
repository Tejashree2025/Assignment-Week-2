class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        // for(int i=0;i<arr.length-1;i++){
        //     sum=arr[i]+arr[i+1];
        //     if(sum==target){
        //         return true;
        //     }
        // }
        // return false;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
        
    }
}