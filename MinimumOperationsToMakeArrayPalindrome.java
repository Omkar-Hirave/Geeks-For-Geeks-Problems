public class MinimumOperationsToMakeArrayPalindrome{
    public static int modifyArray(int[] nums) {
        int ans = 0 ;
        int left = 0 , right = nums.length-1;
        while(left <= right){
            if(nums[left] == nums[right]){
                left++;
                right--;
            }else if(nums[left] > nums[right]){
                right--;
                nums[right] = nums[right] + nums[right+1];
                ans++;
            }else if(nums[left] < nums[right]){
                left++;
                nums[left] = nums[left] + nums[left-1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 5, 6, 7, 8};
        int result = modifyArray(nums);
        System.out.println("Number of modifications: " + result);
    }
}
