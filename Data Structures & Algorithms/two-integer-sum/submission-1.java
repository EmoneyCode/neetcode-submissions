class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int num = 0;
        int [] twosol = new int[2];
        for(int i = 0; i<nums.length; i++){
            num = target - nums[i];
            if(m.containsKey(num)){
                twosol[0] = m.get(num);
                twosol[1] = i;
                return twosol;
            }
            m.put(nums[i],i);
        }
        return twosol;
        
    }
}
