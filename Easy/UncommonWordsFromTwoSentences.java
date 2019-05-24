class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        if(A.length()==0) {
            return B.split(" ");
        } else if(B.length()==0) {
            return A.split(" ");
        }
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String s : A.split(" ")) {
            map1.put(s, (map1.containsKey(s)?map1.get(s):0)+1);
        }
        for(String s : B.split(" ")) {
            map2.put(s, (map2.containsKey(s)?map2.get(s):0)+1);
        }
        String[] resultTemp = new String[250];
        int counter = 0;
        for(String key : map1.keySet()) {
            if(!map2.containsKey(key) && map1.get(key)==1) {
                resultTemp[counter]=key;
                counter++;
            }
        }
        for(String key : map2.keySet()) {
            if(!map1.containsKey(key) && map2.get(key)==1) {
                resultTemp[counter]=key;
                counter++;
            }
        }
        String[] result = new String[counter];
        for(int i=0; i<counter; i++) {
            result[i] = resultTemp[i];
        }
        return result;
    }
}