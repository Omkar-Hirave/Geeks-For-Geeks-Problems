public class Move_All_Negative_Numbers_To_Beginning {
    public static int[] separateNegativeAndPositive(int nums[]) {
        move(nums);
        return nums;
    }
    public static void move(int[] nums){
        int low = 0  ,high = nums.length-1;
        while(low <= high){
            if(nums[low] < 0){
                low++;
            }else if(nums[high] < 0){
                swap(nums , low , high);
                low++;
                high--;
            }else{
                high--;
            }
        }
    }
    public static void swap(int[] nums ,int left , int right){
        int temp = nums[left] ; 
        nums[left] = nums[right];
        nums[right] = temp;
    }
	public static void main(String[] args) {
        int[] nums = { 1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1 };
        move(nums);
        for (int e : nums)
            System.out.print(e + " ");
    }
}


