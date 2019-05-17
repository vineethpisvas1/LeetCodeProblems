class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(i%10!=0 && isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
    public boolean isSelfDividingNumber(int a) {
        int temp = a;
        while(temp!=0) {
            if(temp%10==0 || a % (temp%10) != 0) {
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}