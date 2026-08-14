class Solution {
    public int maxScore(String s) {
        int[] zero = new int[s.length()];
        int[] one = new int[s.length()];
        int z = 0, o = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') z++;
            else o++;
            zero[i] = z; one[i] = o;
        }
        int ans = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int leftPoint = zero[i];
            int rightPoint = one[s.length() - 1] - one[i];
            ans = Math.max(ans, leftPoint + rightPoint);
        }
        return ans;
    }
}