class Solution {
    public boolean isPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while(low < high) {
            char currLow = s.charAt(low);
            char currHigh = s.charAt(high);

            if(!Character.isLetterOrDigit(currLow)) {
                low++;
            } else if(!Character.isLetterOrDigit(currHigh)) {
                high--;
            } else {
                if(Character.toLowerCase(currLow) != Character.toLowerCase(currHigh)) {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
        
}