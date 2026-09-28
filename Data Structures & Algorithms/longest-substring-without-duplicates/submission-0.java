class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Set<Character> length = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            while(length.contains(s.charAt(i))){
                length.remove(s.charAt(l));
                l++;
            }
            length.add(s.charAt(i));
            max = Math.max(max, length.size());
        }
        return max;
    }
}
