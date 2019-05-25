class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        for(String string : ops) {
            if(string.equals("C")) {
                if(list.size()>0) {
                    list.remove(list.size()-1);
                }
            } else if(string.equals("D")) {
                if(list.size()>0) {
                    list.add(2*list.get(list.size()-1));
                }
            } else if(string.equals("+")) {
                if(list.size()>1) {
                    list.add(list.get(list.size()-1)+list.get(list.size()-2));
                }
            } else {
                list.add(Integer.parseInt(string));
            }
        }
        int sum=0;
        for(Integer listItem : list) {
            sum += listItem;
        }
        return sum;
    }
}