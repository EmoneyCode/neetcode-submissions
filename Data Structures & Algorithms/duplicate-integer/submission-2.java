class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> p = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(p.contains(nums[i])){
                return true;
            }
            else{
                p.add(nums[i]);
            }
        }
        return false;
    }
}
