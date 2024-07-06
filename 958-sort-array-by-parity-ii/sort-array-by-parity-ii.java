class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;

        while(even < n && odd < n) {
            // Catch is even pointer will move ahead only if even indexes has even number.
            if(nums[even] % 2 != 0) {
                swap(nums, even, odd);
                odd += 2;
            } else {
                even += 2;
            }
        }
        return nums;
    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}