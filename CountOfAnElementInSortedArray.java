class CountOfAnElementInSortedArray {
    public int getCount(int[] nums, int target) {
        int firstPosition = firstPosition(nums, target);
        int lastPosition = lastPosition(nums, target);
        return lastPosition - firstPosition + 1;
    }
    
    public int firstPosition(int[] nums, int target) {
        int low = 0, result = -1; 
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }
        }
        
        return result;
    } 
    
    public int lastPosition(int[] nums, int target) {
        int low = 0, result = -1; 
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        CountOfAnElementInSortedArray solution = new CountOfAnElementInSortedArray();
        
        int[] nums = {1, 2, 2, 3, 3,3,3,3, 4, 5, 5};
        int target = 3;
        int count = solution.getCount(nums, target);
        
        System.out.println("Count: " + count);
    }
}
