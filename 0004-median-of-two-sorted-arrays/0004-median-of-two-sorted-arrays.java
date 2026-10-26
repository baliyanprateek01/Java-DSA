class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        if(arr.length %2 != 0){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }

    }
}