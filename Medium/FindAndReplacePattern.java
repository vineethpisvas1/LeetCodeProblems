class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = F(pattern);
        List<String> result = new ArrayList<>();
        for (String word : words)
            if (Arrays.equals(F(word), p)) {
                result.add(word);
            }
        return result;
    }

    public int[] F(String word) {
        HashMap<Character, Integer> m = new HashMap<>();
        int n = word.length();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            m.putIfAbsent(word.charAt(i), m.size());
            result[i] = m.get(word.charAt(i));
        }
        return result;
    }
}