import java.util.* ;
import java.io.*; 
import java.util.*;
/****
 * Following is the java Pair class
 * class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }
}
 */
public class Solution {

    public static ArrayList<Pair> duplicate_char(String s, int n) {
        char[] charArray = new char[s.length()];     
        for(int i = 0 ; i < charArray.length ; i++){
            charArray[i] = s.charAt(i);
        }
        Arrays.sort(charArray);
        int freq = 1;
        ArrayList<Pair> result = new ArrayList<>();
        for(int i = 1 ; i < charArray.length ; i++){
            if(charArray[i] == charArray[i-1]){
                freq++;
            }else{
                result.add(new Pair(charArray[i-1], freq));
                freq = 1 ;
            }
        }
        result.add(new Pair(charArray[charArray.length - 1], freq));
        return result;
        }
}