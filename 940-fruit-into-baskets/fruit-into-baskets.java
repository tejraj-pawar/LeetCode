class Solution {
    public int totalFruit(int[] fruits) {
        /*https://www.youtube.com/watch?v=s_zu2dOkq80
        logic: starting point matters, i.e. you have to find largest sub-array of two numbers.*/
        int res = 0;
        Map<Integer, Integer> track = new HashMap<>();

        for(int l = 0, r = 0; r < fruits.length; r++) {
            track.put(fruits[r], track.getOrDefault(fruits[r], 0) + 1);

            while(track.size() > 2) {
                track.put(fruits[l], track.get(fruits[l]) - 1);
                track.remove(fruits[l], 0); // remove if fruits[l] has value zero.
                l++;
            }

            res = Math.max(res, r - l + 1);
            
        }
        return res;
        
    }
}