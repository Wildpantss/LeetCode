class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int length = arr.length;
        ArrayList<DivideInfo> temp = new ArrayList<>();

        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < length; ++j) {
                temp.add(new DivideInfo(arr[i], arr[j], arr[i] * 1.0 / arr[j]));
            }
        }

        temp.sort((a, b) -> a.divided.compareTo(b.divided));
        int[] retVal = new int[2];
        DivideInfo di = temp.get(k - 1);
        retVal[0] = di.i;
        retVal[1] = di.j;

        return retVal;
    }

    class DivideInfo {
        int i;
        int j;
        Double divided;

        DivideInfo (int i, int j, double divided) {
            this.i = i;
            this.j = j;
            this.divided = divided;
        }
    }
}
