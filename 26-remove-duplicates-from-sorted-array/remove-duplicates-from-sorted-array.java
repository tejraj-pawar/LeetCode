class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Both i and j are starting from 1 assuming first element is always unique.
        int j = 1;

        // Logic is to put unique num to the front of the array.
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}