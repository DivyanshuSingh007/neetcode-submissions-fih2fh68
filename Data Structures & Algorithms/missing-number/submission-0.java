class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            temp.add(nums[i]);
        }
        for(int i = 0; i <= nums.length; i++){
            temp.add(i);
        }
        int ans = temp.get(0);
        for(int i = 1; i < temp.size(); i++){
            ans ^= temp.get(i);
        }
        return ans;
    }
}
