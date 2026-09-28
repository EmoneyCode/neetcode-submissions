class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(left<right){
                if(nums[left]+nums[right]+nums[i] == 0){
                    List<Integer> list = Arrays.asList(nums[left],nums[right],nums[i]);
                    right--;
                    left++;
                    result.add(list);
                    if(right>left && nums[right] == nums[right+1])right--;
                    if(left>nums.length && nums[left] == nums[left-1])left++;
                }
                if(nums[left]+nums[right]+nums[i] < 0){
                    left++;
                }
                if(nums[left]+nums[right]+nums[i] > 0){
                    right--;
                }
            }
        }
        return result;
    }
}
