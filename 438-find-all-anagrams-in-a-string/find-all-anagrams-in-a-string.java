class Solution {
    /* Brute-Force: Use sliding window approach and sort window_str and compare with p
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        int k = p.length();

        p = sortString(p);

        for(int i=0; i<s.length()-k+1; i++) {
            String temp = s.substring(i, i+k);
            if(p.equals(sortString(temp))) res.add(i);
        }
        return res;
    }

    private String sortString(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        return String.valueOf(tempArray);
    }
    */

    /*
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        if(sLen < pLen) return new ArrayList<>();
        

        List<Integer> res = new ArrayList<>();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>(); 

        //First window
        for(int i=0; i<pLen; i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if(sMap.equals(pMap)) res.add(0);

        //Slide window till last
        for(int i=pLen; i<sLen; i++) {
            //Add new window element(front)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            //Remove existing window element(rear)
            char discard = s.charAt(i-pLen);
            sMap.put(discard, sMap.get(discard) - 1);

            // This is needed or else while comparing it will break
            if(sMap.get(discard) == 0) sMap.remove(discard);

            if(sMap.equals(pMap)) res.add(i - pLen + 1);
        }

        return res;
    }
    */

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        if(sLen < pLen) return new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();

        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        for(int i=0; i<pLen; i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sFreq, pFreq)) res.add(0);

        for(int i=pLen; i<sLen; i++) {
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i-pLen) - 'a']--;

            if(Arrays.equals(sFreq, pFreq)) res.add(i - pLen + 1);
        }

        return res;



    }



}