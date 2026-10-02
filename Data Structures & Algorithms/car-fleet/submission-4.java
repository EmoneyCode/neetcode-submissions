class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        TreeMap<Integer,Integer> tracked = new TreeMap<>();
        for(int i = 0; i < position.length; i++){
            tracked.put(position[i],speed[i]);
        }
        for(Map.Entry<Integer, Integer> map: tracked.descendingMap().entrySet()){
            double time = ((double)target - map.getKey()) / map.getValue();
            if(!stack.isEmpty() && time<=stack.peek()){
                continue;
            }
            else{
                stack.push(time);
            }
        }
        return stack.size();
    }
}
