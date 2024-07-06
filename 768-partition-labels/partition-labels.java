

import static java.util.Collections.lastIndexOfSubList;

class Solution {
    public List<Integer> partitionLabels(String s) {
        /* Approach: 1 [Not recommended]
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        
        int count = 0;
        int startIndex = 0;
        int lastOccurenceIndex = 0;

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            lastOccurenceIndex = Math.max(lastOccurenceIndex, s.lastIndexOf(c));

            count++;
            if(s.substring(startIndex, i+1).contains(String.valueOf(c)) && !s.substring(i+1, n).contains(String.valueOf(c)) && i==lastOccurenceIndex) {
                res.add(count);
                count = 0;
                startIndex = i+1;
            }

        } 
        return res;
        */

        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> res = new ArrayList<>();
        int prev = -1;
        int max = 0;

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));

            if(max == i) {
                res.add(max - prev);
                prev = max; 
            }
        }
        return res;
    }
}