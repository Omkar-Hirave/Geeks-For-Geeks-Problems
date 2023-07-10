class findCeilBinarySearch{
    public static int findCeil(int[] nums , int target){
        int low = 0 ; 
        int high = nums.length-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target){
                ans = nums[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,8,10,11,12,19};
        int target = 5; 
        int ceil = findCeil(nums , target);
        System.out.println("The ceil of the sorted array is "+ceil);
    }
}