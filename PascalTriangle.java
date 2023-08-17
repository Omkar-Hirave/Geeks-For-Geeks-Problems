public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  "); // Add appropriate spacing
            }
            
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   "); // Adjust spacing for numbers
                num = num * (i - j) / (j + 1);
            }   
            System.out.println();
        }
    }
}
