class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char c: chars.toCharArray()) {
            if(hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c)+1);
            } else {
                hashmap.put(c, 1);
            }
        }
        HashMap<Character, Integer> temp = new HashMap<>();
        int sum = 0;
        for(String s: words) {
            temp.putAll(hashmap);
            int legit = 1;
            for(int i=0; i<s.length(); i++) {
                if(!temp.containsKey(s.charAt(i)) || temp.get(s.charAt(i))<=0) {
                    legit=0;
                } else {
                    temp.put(s.charAt(i), temp.get(s.charAt(i))-1);
                }
            }
            if(legit==1) {
                sum = sum + s.length();
            }
        }
        return sum;
    }
}