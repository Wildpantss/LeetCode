class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0; // no attack
        
        int poison_remaining = 0;
        int last_attack = timeSeries[0];
        int cnt = 0;

        for (int i = 1; i < timeSeries.length; ++i) {
            int current_attack = timeSeries[i];
            if ((current_attack - last_attack) > duration) {
                cnt += duration;
            } else {
                cnt += (current_attack - last_attack);
            }
            last_attack = current_attack;
        }

        return cnt + duration;
    }
}