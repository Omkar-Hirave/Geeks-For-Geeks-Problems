class Result {
    public static int alternatingCharacters(String s) {

        int count = 0 ;
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i -1 )){
                count++;
            }
        }
        return count ; 
    }
}