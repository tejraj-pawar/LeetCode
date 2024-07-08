
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0, right = 0;

        // abs(i - j) <= k condition denotes that we have to use sliding window pf size k
        Set<Integer> window = new HashSet<>();

        while(right < nums.length) {
            if(right - left > k) {
                window.remove(nums[left]);
                left++;
            }
            if(window.contains(nums[right])) 
                return true;
            window.add(nums[right]);
            right++;
        }
        return false;
    }
}