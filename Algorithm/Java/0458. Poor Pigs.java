class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        /**
            rounds-维度，
            pig_cnt-每维大小
         */
        int rounds = minutesToTest / minutesToDie + 1;
        int pigCnt = 0;
        while(Math.pow(rounds,pigCnt) < buckets) {
            pigCnt ++;
        }
        //now rounds^pigCnt >= buckets
        return pigCnt;
    }
}