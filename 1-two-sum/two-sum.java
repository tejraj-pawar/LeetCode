class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> track = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int diff = target - nums[i];
            if(track.containsKey(diff)) {
                return new int[]{i, track.get(diff)};
            }
            track.put(nums[i], i);
        }
        return new int[]{};
    }
}