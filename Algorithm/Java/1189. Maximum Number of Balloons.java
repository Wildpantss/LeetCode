class Solution {
    public int maxNumberOfBalloons(String text) {
        // key order: a-0, b-1, l-2, n-3, o-4; value required: 1, 1, 2, 1, 2
        int[] cnt = new int[5];

        // traverse string
        for (int i = 0; i < text.length(); ++i) {
            switch(text.charAt(i)) {
                case 'a': ++cnt[0]; break;
                case 'b': ++cnt[1]; break;
                case 'l': ++cnt[2]; break;
                case 'n': ++cnt[3]; break;
                case 'o': ++cnt[4]; break;
            }
        }

        // final calc
        cnt[2] /= 2;
        cnt[4] /= 2;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; ++i) {
            min = Math.min(min, cnt[i]);
        }

        return min;
    }
}
