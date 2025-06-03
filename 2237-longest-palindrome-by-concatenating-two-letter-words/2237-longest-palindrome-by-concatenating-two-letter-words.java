class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> s = new HashMap<>();
        for(String w : words) {
            s.put(w, s.getOrDefault(w, 0) + 1);
        }
        int ans = 0, twin = 0;
        for(String key : s.keySet()) {
            if(s.get(key) > 0) {
                String rev = new String(new char[]{key.charAt(1), key.charAt(0)});
                if(s.getOrDefault(rev, 0) > 0) {
                    if(!key.equals(rev)){
                        int pairs = Math.min(s.get(key), s.get(rev));
                        ans += 4 * pairs;
                        s.put(key, s.get(key) - pairs);
                        s.put(rev, s.get(rev) - pairs);
                    } else {
                        if(s.get(rev) % 2 == 1) {
                            twin = 2;
                        } 
                        ans += (s.get(key) / 2) * 4;
                        s.put(key, s.get(key) % 2);
                    }
                }
            }
        }
        return ans + twin;
    }
}