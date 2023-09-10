import java.util.*;

class Second_Most_Repeated_String_Sequence {
    public static String secFrequent(String arr[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value < firstMax) {
                secondMax = value;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMax) {
                return entry.getKey();
            }
        }
        return "";
    }
    public static void main(String[] args) {       

        String[] arr = {"apple", "banana", "apple", "cherry", "banana", "cherry", "apple"};
        int n = arr.length;
        
        String result = secFrequent(arr, n);
        
        if (!result.isEmpty()) {
            System.out.println("Second most repeated string: " + result);
        } else {
            System.out.println("No second most repeated string found.");
        }
    }
}
