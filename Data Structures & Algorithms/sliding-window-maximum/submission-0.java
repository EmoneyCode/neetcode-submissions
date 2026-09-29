class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int l = 1;
        int r = k;
        int[] ans = new int [nums.length-k+1];
        for(int i = 0; i<k; i++){
            pq.add(nums[i]);
        }
        ans[0] = pq.peek();
        while(r<nums.length){
            pq.remove(nums[l-1]);
            pq.add(nums[r]);
            ans[l] = pq.peek();
            l++;
            r++;
        }
        return ans;
    }
}
