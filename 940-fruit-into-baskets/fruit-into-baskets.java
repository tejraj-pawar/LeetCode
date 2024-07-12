class Solution {
    public int totalFruit(int[] fruits) {
        /*https://www.youtube.com/watch?v=s_zu2dOkq80
        logic: starting point matters, i.e. you have to find largest sub-array of two numbers.*/
        int maxFruits = 0, s = -1;
        int idx1 = -1, idx2 = -1, val1 = 0, val2 = 0, type;
        for (int i = 0; i < fruits.length; i++) {
            type = fruits[i];
            if (idx1 == -1 || type == val1) {
                idx1 = i;
                val1 = type;
            } else if (idx2 == -1 || type == val2) {
                idx2 = i;
                val2 = type;
            } else {
                if (idx1 < idx2) {
                    s = idx1;
                    idx1 = i;
                    val1 = type;
                } else {
                    s = idx2;
                    idx2 = i;
                    val2 = type;
                }
            }
            maxFruits = Math.max(maxFruits, i - s);
        }
        return maxFruits;
        
    }
}