class Solution {
    public int numberOfMatches(int n) {
        // 每配对一次，产生一个失败者，最后有n-1个失败者
        return n-1;
    }
}
