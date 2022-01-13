class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // both could be out of order
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int minRadius = 0;
        for (int i = 0, j = 0; i < houses.length; i++) {
            int curDistance = Math.abs(houses[i] - heaters[j]);
            while (j < heaters.length - 1 && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) { 
                // 房子相邻的heater里必须选距离较大的
                j++;
                curDistance = Math.min(curDistance, Math.abs(houses[i] - heaters[j]));
            }
            minRadius = Math.max(minRadius, curDistance);
        }
        return minRadius;
    }
}
