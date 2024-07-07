class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int len = s.length();
        int maxLen = 0;

        Set<Character> track = new HashSet<>();

        while(j < len) {
            if(!track.contains(s.charAt(j))) {
                track.add(s.charAt(j));
                j++;
            } else {
                while(track.contains(s.charAt(j))) {
                    track.remove(s.charAt(i));
                    i++;
                }
            }
            maxLen = Math.max(maxLen, j-i);
        }
        System.out.print(track);
        return maxLen;
    }
}