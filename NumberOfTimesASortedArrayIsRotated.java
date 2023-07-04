public class NumberOfTimesASortedArrayIsRotated {
    public int findCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        NumberOfTimesASortedArrayIsRotated solution = new NumberOfTimesASortedArrayIsRotated();
        int count = solution.findCount(nums);
        System.out.println("The array is rotated following number of times: " + count);
    }
}
