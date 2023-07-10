class findFloorBinarySearch{
    public static int findFloor(int[] nums , int target){
        int low = 0 ;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= target){
                ans = nums[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,8,10,11,12,19};
        int target = 13; 
        int ans = findFloor(nums , target);
        System.out.println("Floor element of the array is "+ans);
    }
}