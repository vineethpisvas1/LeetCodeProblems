class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) {
            return stones[0];
        }
        List<Integer> list = new ArrayList<>();
        for (int i : stones) {
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        while(list.size()>=2) {
            int temp = list.get(0)-list.get(1);
            list.remove(list.get(1));
            list.remove(list.get(0));
            if(temp!=0) {
                list.add(0, temp);
                Collections.sort(list);
                Collections.reverse(list);
            }
        }
        return list.size()>0?list.get(0):0;
    }
}