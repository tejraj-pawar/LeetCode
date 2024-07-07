class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int len = s.length();
        int maxLen = 0;

        Set<Character> track = new HashSet<>();

        for(int r=0; r<len; r++) {
            while (track.contains(s.charAt(r))) {
                track.remove(s.charAt(l));
                l++;
            }
            track.add(s.charAt(r));
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}