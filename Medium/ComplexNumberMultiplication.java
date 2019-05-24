class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] num1 = a.split("\\+");
        String[] num2 = b.split("\\+");
        int real1 = Integer.parseInt(num1[0]);
        int real2 = Integer.parseInt(num2[0]);
        int imaginary1 = Integer.parseInt(num1[1].substring(0, num1[1].length() - 1));
        int imaginary2 = Integer.parseInt(num2[1].substring(0, num2[1].length() - 1));
        int resultReal = real1*real2 - imaginary1*imaginary2;
        int resultImaginary = real2*imaginary1 + real1*imaginary2;
        return resultReal+"+"+resultImaginary+"i";
    }
}