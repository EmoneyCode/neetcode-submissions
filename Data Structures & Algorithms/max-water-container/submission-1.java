class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length-1;
        int left = 0;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int height = Math.min(heights[right], heights[left]);
            int curWater = height * (right - left);
            max = Math.max(curWater,max);
            if(heights[right]>heights[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
