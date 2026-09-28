class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char character = s.charAt(0);
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));

            while((i-l+1) - maxFreq > k){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, i-l+1);
        }
        return maxLen;
    }
}
