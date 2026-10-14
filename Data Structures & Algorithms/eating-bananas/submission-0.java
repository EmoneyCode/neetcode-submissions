class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int output = 0;
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(check(piles, mid, h)){
                right = mid - 1;
                output = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return output; 
    }

    public boolean check(int[] arr, int mid, int k){
        // function to check whether mid speed is enough
        // to eat all piles of bananas under k hours
        int totalHours = 0;
        for(int i = 0; i<arr.length; i++){
        // return true if required time is less than 
        // or equals to given hour, otherwise return false
            totalHours += (arr[i] + mid - 1)/mid;
        }
        return totalHours <= k;
    }
}
