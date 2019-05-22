class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        String[] result = new String[words.length];
        int count=0;
        map.put('a', 2);
        map.put('b', 3);
        map.put('c', 3);
        map.put('d', 2);
        map.put('e', 1);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('i', 1);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        map.put('m', 3);
        map.put('n', 3);
        map.put('o', 1);
        map.put('p', 1);
        map.put('q', 1);
        map.put('r', 1);
        map.put('s', 2);
        map.put('t', 1);
        map.put('u', 1);
        map.put('v', 3);
        map.put('w', 1);
        map.put('x', 3);
        map.put('y', 1);
        map.put('z', 3);
        for(String word : words) {
            String tempWord = word.toLowerCase();
            int breakCount = 0;
            for(char c : tempWord.toCharArray()) {
                if(map.get(tempWord.charAt(0))!=map.get(c)) {
                    breakCount++;
                }
            }
            if(breakCount==0) {
                result[count]=word;
                count++;
            }
        }
        String[] actualResult = new String[count];
        for(int i=0; i<count; i++) {
            actualResult[i]=result[i];
        }
        return actualResult;
    }
}