class Solution {
    public String defangIPaddr(String address) {
        // For best time complexity, can also be done using stringbuilder.
        return address.replace(".", "[.]");
    }
}