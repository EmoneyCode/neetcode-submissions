class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            numsSet.add(nums[i]);
        }

        int longest = 0;
        for(int i = 0; i<nums.length; i++){
            int currlongest = 0;
            int currElem = nums[i];
            if(!numsSet.contains(nums[i]-1)){
                currlongest++;
                while(numsSet.contains(currElem+1)){
                    currlongest++;
                    currElem++;
                }
                longest = Math.max(longest,currlongest);
            }
        }
        return longest;
    }
}
