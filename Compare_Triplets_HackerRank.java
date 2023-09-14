class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> list = new ArrayList<>();
        int aCount = 0  , bCount = 0 ;
        for(int i = 0 ; i < a.size() ; i++){
            if(a.get(i) > b.get(i)){
                aCount++;
            }else if(a.get(i) < b.get(i)){
                bCount++;
            }
        }
        list.add(aCount);
        list.add(bCount);
        return list;
    }
}