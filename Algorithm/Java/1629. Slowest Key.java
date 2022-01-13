class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char currentMaxBtn = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; ++i) {
            int currentDuration = releaseTimes[i] - releaseTimes[i-1];
            if (currentDuration > maxDuration) {
                maxDuration = currentDuration;
                currentMaxBtn = keysPressed.charAt(i); 
            }
            else if (currentDuration == maxDuration) {
                if(keysPressed.charAt(i) > currentMaxBtn) {
                    maxDuration = currentDuration;
                    currentMaxBtn = keysPressed.charAt(i); 
                }
            }
        }
        return currentMaxBtn;
    }
}
