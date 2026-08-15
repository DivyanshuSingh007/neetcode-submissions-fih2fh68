class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> pref = new HashMap<>();
        int sum = 0,rem = 0, cnt = 0;
        pref.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            rem = ((sum % k) + k) % k;
            if(pref.containsKey(rem)) cnt += pref.get(rem);
            pref.put(rem,pref.getOrDefault(rem, 0) + 1);
        }
        return cnt;
    }
}