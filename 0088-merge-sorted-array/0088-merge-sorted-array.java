class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m - 1;       
        int last2 = n - 1;       
        int p = m + n - 1;    
        while (last2 >= 0) {
            if (last1 >= 0 && nums1[last1] > nums2[last2]) {
                nums1[p] = nums1[last1];
                last1--;
            } else {
                nums1[p] = nums2[last2];
                last2--;
            }
            p--;
        }
    }
}