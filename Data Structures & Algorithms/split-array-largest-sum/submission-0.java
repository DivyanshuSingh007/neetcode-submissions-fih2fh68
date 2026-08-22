class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        while(low < high){
            int mid = (low + high ) /2;
            int temp = mid;
            int parts = 1;
            for(int num : nums){
                if(temp >= num){
                    temp -= num;
                }
                else{
                    temp = mid - num;
                    parts++;
                }
            }
            if(parts > k) low = mid + 1;
            else high = mid;
        }
        return high;
    }
}