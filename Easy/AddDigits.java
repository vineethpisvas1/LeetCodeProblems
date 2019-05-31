class Solution {
    public int addDigits(int num) {
        String number = Integer.toString(num);
        int sum = 0;
        while(number.length()>1) {
            sum = 0;
            for(char c : number.toCharArray()) {
                sum += c - 48;
            }
            number = Integer.toString(sum);
        }
        return Integer.parseInt(number);
    }
}