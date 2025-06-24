// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        
        int count =0;
        int left=0;
        int right=arr.length-1;
        int sum=0;
        
        while(left<right){
            sum=arr[left]+arr[right];
            
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                //sum==target
                
                int ele1=arr[left];
                int ele2=arr[right];
                int countL=0;
                int countR=0;
                
                while(left<=right && arr[left]==ele1){ 
                    left++;
                    countL++;//frequency of left appreances
                }
                
                while(left<=right && arr[right]==ele2){
                    right--;
                    countR++;//frequency of left appreances
                }
                if(ele1==ele2){
                    count+=countL*(countL-1)/2;
                }
                else{
                    count+=countL*countR;
                }
            }
            
        }
        return count;
    }
}
