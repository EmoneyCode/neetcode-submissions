class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length - 2;
        int area = 0;
        int lMax = height[left - 1];
        int rMax = height[right + 1];
        while(left<=right){
            if(lMax <= rMax){
                lMax = Math.max(lMax, height[left]);
                area += Math.max(0,lMax - height[left]);
                left++;
            }
            else{
                rMax = Math.max(rMax, height[right]);
                area += Math.max(0,rMax - height[right]);
                right--;
            }
        }
        return area;
    }
}
