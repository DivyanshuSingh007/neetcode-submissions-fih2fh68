class Solution {
    public int findMin(int[] nums) {
         int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            // if(nums[mid] == target) return nums[mid];
            if(nums[low] <= nums[mid]){
                if(nums[mid] > nums[high]) low = mid + 1;
                else high = mid;
            }
            else{
                if(nums[mid] < nums[high]) high = mid;
                else low = mid + 1;
            }
        }
        return nums[high];
    }
}
