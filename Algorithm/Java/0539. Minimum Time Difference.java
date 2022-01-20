class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0; // if cases > 1440, must exists duplicated times

        int[] timeArray = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); ++i) {
            timeArray[i] = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60 + Integer.parseInt(timePoints.get(i).substring(3));
        }
        Arrays.sort(timeArray);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < timeArray.length; ++i) {
            min = Math.min(min, timeArray[i] - timeArray[i-1]);
        }
        return Math.min(min, timeArray[0] + 1440 - timeArray[timeArray.length - 1]);
    }
}
