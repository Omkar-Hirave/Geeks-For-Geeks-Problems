import java.io.*;
import java.util.*;

class DuplicatesInString
{
	static void printDups(String str)
	{
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
		if(count.containsKey(ch)){
			count.put(ch , count.get(ch)+1);
		}else{
			count.put(ch,1);
		}
    }

		for (Map.Entry<Character,Integer> map : count.entrySet()) {
		if (map.getValue() > 1){
            char ch = map.getKey() ;
			int occurence = map.getValue();
			System.out.println(ch+ ", count = " + occurence);
            } 	
		}
	}
		public static void main(String args[])
		{
			String str = "test string";
			printDups(str);
		}
}

