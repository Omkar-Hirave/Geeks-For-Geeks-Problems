public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int i = 0 , j = 0 ;
        while(i < a.length){
            if(a[i] > b[j]){
                long temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                sortSecondArray(b);
            }
            i++;
        }
    }
    public static void sortSecondArray(long []b){
        for(int i = 1 ; i < b.length ; i++){
            if(b[i] < b[i-1]){
                long temp = b[i];
                b[i] = b[i-1];
                b[i-1] = temp;
            }
        }
    }
}