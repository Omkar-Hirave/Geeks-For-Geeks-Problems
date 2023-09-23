class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!set.contains(s.charAt(i))){
                sb.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        return sb.toString();
    }
}