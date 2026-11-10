class Solution {
    public boolean search(int[] nums, int tar) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == tar)
                return true;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= tar && tar < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if (nums[mid] < tar && tar <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}