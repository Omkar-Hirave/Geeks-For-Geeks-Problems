public class Solution {
    public static int lowerBound(int []nums, int n, int x) {
       int low = 0 ;
       int high = n - 1;
       int ans = n;
       while(low <= high){
           int mid = low + (high - low)/2;
           if(nums[mid] >= x){
               ans = mid ; 
               high = mid - 1;
           }else{
               low = mid + 1;
           }
       }
       return ans;
    }
}