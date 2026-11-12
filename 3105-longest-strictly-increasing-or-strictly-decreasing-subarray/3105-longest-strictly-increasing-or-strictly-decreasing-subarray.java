class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int count = 1;
        int increase = 1;
        int decrease = 1;
        if(n == 1){
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                increase++;
                decrease = 1;

            } else if (nums[i] < nums[i - 1]) {
                decrease++;
                increase = 1;
            } else {
                increase = 1;
                decrease = 1;
            }
            count = Math.max(count, Math.max(increase, decrease));
        }
        return count;
    }
}