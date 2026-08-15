class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> pref = new HashMap<>();
        int sum = 0, cnt = 0;
        pref.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(pref.containsKey(sum - k)) cnt += pref.get(sum - k);
            pref.put(sum, pref.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}