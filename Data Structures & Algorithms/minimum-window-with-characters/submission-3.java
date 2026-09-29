class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        int counter = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i<t.length(); i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r < s.length()){
            char right = s.charAt(r);
            // Expand the window: Decrement the character balance
             map.put(right,map.getOrDefault(right,0)-1);

            // If the balance is still >= 0, it means it was a needed character from t
            if(map.get(right) >= 0){
                counter++;
            }
            // Shrink the window if current window contains all the characters in t
            while(t.length() == counter){
                // Update the minLen
                if(minLen > r - l + 1){
                    minLen = r - l + 1;
                    ans = s.substring(l,r+1);
                }
                // Shrink the window: Increment the character balance back
                char left = s.charAt(l);
                map.put(left,map.get(left)+1);
                // If the balance goes above 0, a critical character just escaped the window
                if(map.get(left)>0){
                    counter--;
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}
