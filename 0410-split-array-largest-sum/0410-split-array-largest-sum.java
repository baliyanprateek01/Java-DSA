class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            return -1;
        }
        long low = 0;
        long high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (ispossible(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }
    public boolean ispossible(int[] nums, int k, long mid) {
        int count = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > mid) {
                count++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return count <= k;
    }
    }
