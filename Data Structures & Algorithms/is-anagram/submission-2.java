class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> p = new HashMap<>();
        HashMap<Character,Integer> q = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            if(p.containsKey(s.charAt(i))){
                p.put(s.charAt(i),p.get(s.charAt(i))+1);
            }
            else{
                p.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            if(q.containsKey(t.charAt(i))){
                q.put(t.charAt(i),q.get(t.charAt(i))+1);
            }
            else{
                q.put(t.charAt(i),1);
            }
        }
        if(!p.entrySet().equals(q.entrySet())){
            return false;
        }
        return true;
    }
}
