class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueMails = new HashSet<>();
        for(int i=0; i<emails.length; i++) {
            String[] parts = emails[i].split("@");
            emails[i] = parts[0].split("\\+")[0].replace(".", "") + "@" + parts[1];
            uniqueMails.add(emails[i]);
        }
        return uniqueMails.size();
    }
}