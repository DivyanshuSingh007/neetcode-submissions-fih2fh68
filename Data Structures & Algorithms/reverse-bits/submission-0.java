class Solution {
    public int reverseBits(int n) {
        int ans = n & 1;
        int temp = 31;
        n = n >> 1;
        while(temp-- > 0){
            int d = n & 1;
            ans = (ans << 1) | d;
            n = n >> 1;
        }
        return ans;
    }
}
