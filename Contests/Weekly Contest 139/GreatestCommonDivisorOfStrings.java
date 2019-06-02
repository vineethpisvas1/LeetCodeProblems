class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!str1.contains(str2) && !str2.contains(str1)) {
            return "";
        } else if(str1.length()==1 || str2.length()==1) {
            return str2.length()==1?str2:str1;
        } else {
            while(str1.contains(str2) || str2.contains(str1)) {
                if(str1.length()>=str2.length()) {
                    str1 = str1.replace(str2, "");
                    if(str1.length()==0) {
                        return str2;
                    } else {
                        str2 = str2.replace(str1, "");
                        if(str2.length()==0) {
                            return str1;
                        }
                    }
                } else {
                    str2 = str2.replace(str1, "");
                    if(str2.length()==0) {
                        return str1;
                    } else {
                        str1 = str1.replace(str2, "");
                        if(str1.length()==0) {
                            return str2;
                        }
                    }
                }
            }
            return "";
        }
    }
}