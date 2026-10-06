public class Solution {
    public List<List<int>> ThreeSum(int[] nums) {
        Array.Sort(nums);
        List<List<int>> result = new List<List<int>>();
        for(int i = 0; i<nums.Length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int target = -nums[i];
            int right = nums.Length-1;
            while(left<right){
                if(nums[left] + nums[right] < target){
                    left++;
                }
                else if(nums[left] + nums[right] > target){
                    right--;
                }
                else{
                    List<int> trio = new List<int>();
                    trio.Add(nums[i]);
                    trio.Add(nums[left]);
                    trio.Add(nums[right]);
                    result.Add(trio);

                    left++;
                    right--;
                    
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return result;
    }
}
