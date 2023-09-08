import java.util.* ;
import java.io.*; 

public class Solution {
    static int countDigit(long x) {
        int count = 0 ;
        while(x != 0 ){
            x = x  / 10;
            count++;

        }
        return count;
    }
}