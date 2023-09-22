class Solution {    
    public String reverse(String S){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < S.length() ; i++){
            stack.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }
        return sb.toString();
    }
}