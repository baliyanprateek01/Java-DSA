class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = position[n-1] - position[0];
        int ans = 0;
        while(low<=high){
            int mid =  low + (high-low) / 2;
            if(ispossible(position,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public boolean ispossible(int[] nums, int n, int mid){
        int count = 1;
        int pos = nums[0];
        for(int i =0; i<nums.length; i++){
            if(nums[i]-pos >= mid){
                count++;
                pos = nums[i];
            }
        }
        return count>=n;
    }
}