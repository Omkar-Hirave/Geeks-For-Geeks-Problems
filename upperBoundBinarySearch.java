public class Solution {
    public static int upperBound(int []nums, int x, int n){
       int low = 0 ;
       int high = n - 1 ;
       while(low <= high){
           int mid = low + (high - low)/2;
           if(nums[mid] > x){
               n = mid;
               high = mid - 1;
           }else{
               low = mid + 1;
           }
       }
       return n;
    }
}