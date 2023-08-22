public class All_Possible_Subarrays {
   public static void main(String[] args) {
      
      // The array elements
      int nums[] = { 10, 2, 3, 99, 12, 0 };
      System.out.println("The subarrays are-");
    //   From the start index
      for(int i = 0 ; i <nums.length ; i++){
        // From the end index
        for(int j = i ; j < nums.length ; j++){
            // Printing elements from start index to end index
            for(int k = i ; k <= j ; k++){
                System.out.print(nums[k]+" ");
            }
            System.out.println();
        }
      }
   }
}
