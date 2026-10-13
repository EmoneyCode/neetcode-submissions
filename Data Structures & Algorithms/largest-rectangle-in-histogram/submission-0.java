class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int height = 0;
        int length = 0;
        int area = 0;
        for(int i = 0; i <= heights.length; i++){
            int currentHeight = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > currentHeight){
                height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                area = Math.max(height * width, area);
            }
            stack.push(i);
        }
        return area;
    }
}
