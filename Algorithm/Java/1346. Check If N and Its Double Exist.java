class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] map = new int[2005];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0 && map[arr[i]/2 + 1000] > 0) return true; // 记得判断是否能被2整除否则向下取整可能出问题
            if (arr[i]*2<=1000 && arr[i]*2>=-1000 && map[arr[i]*2 + 1000] > 0) return true; // 记得判断越界
            ++map[arr[i] + 1000];
        }
        return false;
    }
}
