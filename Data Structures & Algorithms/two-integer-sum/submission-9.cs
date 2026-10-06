public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> map = new Dictionary<int, int>();
        for(int i = 0; i < nums.Length; i++){
            if(map.TryGetValue(target - nums[i], out var val)){
                return new int[]{val, i};
            }
            else{
                map.TryAdd(nums[i],i);
            }
        }
        return new int[]{};
    }
}
