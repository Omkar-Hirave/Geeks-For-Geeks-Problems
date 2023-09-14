class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int maxCount = 0 , minCount = 0 ;
        int currentMax = scores.get(0) , currentMin = scores.get(0);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i < scores.size() ; i++){
            if(scores.get(i) >  currentMax){
                currentMax = scores.get(i);
                maxCount++;
            }
            if(scores.get(i) < currentMin){
                currentMin = scores.get(i);
                minCount++;
            }
        }
        list.add(maxCount);
        list.add(minCount);
        
        return list; 
        
    }

}