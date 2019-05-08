class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueStrings = new HashSet<>();
        StringBuilder morseString = new StringBuilder("");
        for(String word : words) {
            for(char alphabet : word.toCharArray()) {
                morseString.append(morseCodes[alphabet-97]);
            }
            uniqueStrings.add(morseString.toString());
            morseString.setLength(0);
        }
        return uniqueStrings.size();
    }
}