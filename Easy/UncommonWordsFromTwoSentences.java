class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        if(A.length()==0) {
            return B.split(" ");
        } else if(B.length()==0) {
            return A.split(" ");
        }
        Map<String, Integer> map = new HashMap<>();
        for(String s : (A+" "+B).split(" ")) {
            map.put(s, (map.containsKey(s)?map.get(s):0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key)==1) {
                list.add(key);
            }
        }
        return list.toArray(new String[0]);
    }
}