class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> hashmap = new HashMap<>();
        for(int i=0; i<cpdomains.length; i++) {
            int index = cpdomains[i].indexOf(' ');
            String domain = cpdomains[i].substring(index + 1);
            int hits = Integer.valueOf(cpdomains[i].substring(0, index));
            if(hashmap.containsKey(domain)) {
                hashmap.put(domain, hashmap.get(domain)+hits);
            } else {
                hashmap.put(domain, hits);
            }
            int indexOfPeriod = domain.indexOf('.');
            String sub2 = domain.substring(indexOfPeriod + 1);
            indexOfPeriod = sub2.indexOf('.');
            if(indexOfPeriod==-1) {
                if(hashmap.containsKey(sub2)) {
                    hashmap.put(sub2, hashmap.get(sub2)+hits);
                } else {
                    hashmap.put(sub2, hits);
                }
            } else {
                String sub3 = sub2.substring(indexOfPeriod + 1);
                sub2 = sub2.substring(0, indexOfPeriod);
                if(hashmap.containsKey(sub2+"."+sub3)) {
                    hashmap.put(sub2+"."+sub3, hashmap.get(sub2+"."+sub3)+hits);
                } else {
                    hashmap.put(sub2+"."+sub3, hits);
                }
                if(hashmap.containsKey(sub3)) {
                    hashmap.put(sub3, hashmap.get(sub3)+hits);
                } else {
                    hashmap.put(sub3, hits);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for(String key : hashmap.keySet()) {
            result.add(hashmap.get(key).toString().concat(" ").concat(key));
        }
        return result;
    }
}