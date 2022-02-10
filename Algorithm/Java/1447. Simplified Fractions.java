class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for (int down = 2; down <= n; ++down) {
            for (int up = 1; up < down; ++up) {
                if (gcd(up, down) == 1) { // valid
                    ans.add(up + "/" + down);
                }
            }
        }
        return ans;
    }

    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
