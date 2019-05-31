class Solution {
    public int addDigits(int num) {
        if(num==0) {
            return num;
        }
        int result = num%9;
        return result==0?9:result;
    }
    
    /*
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
    */
}