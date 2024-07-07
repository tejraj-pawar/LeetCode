class Solution {
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
}