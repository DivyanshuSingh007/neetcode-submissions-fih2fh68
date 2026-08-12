class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0){
            int d = n & 1;
            cnt += d == 1 ? 1 : 0;
            n >>>= 1;
        }
        return cnt;
    }
}