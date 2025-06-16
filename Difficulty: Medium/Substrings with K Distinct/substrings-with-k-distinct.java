// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
       int count=0;
        int arr[]=new int[26];
       
        for(int i=0;i<s.length();i++){
            
            for (int x = 0; x < 26; x++) arr[x] = 0;
             int distinctCount=0;
            for(int j=i;j<s.length();j++){
               int index = s.charAt(j) - 'a';
               
               if(arr[index]==0){
                   distinctCount++;
               }
               
               arr[index]++;
                
                
                if(distinctCount>k)break;
                if(distinctCount == k)count++;
                
            }
        }
        return count;
    }
}