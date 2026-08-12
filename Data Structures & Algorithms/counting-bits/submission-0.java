class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            int cnt = 0;
            int temp = i;
            while(temp != 0){
                int d = temp & 1;
                cnt += d == 1 ? 1 : 0;
                temp = temp >> 1;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
