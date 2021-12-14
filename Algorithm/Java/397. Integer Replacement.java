class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    
    public int integerReplacement(int n) {
        if (n == 1) return 0;
        if(map.containsKey(n)) return map.get(n);

        // n > 1
        // if i even step[i] = step[i/2] + 1
        // if i odd step[i] = min(step[i+1], step[i-1]) + 1
        int res = 0;
        if (n % 2 == 0) { // even
            res = 1 + integerReplacement(n / 2);
        }
        else { // odd
            res = Math.min(integerReplacement(n/2), integerReplacement(n/2 + 1)) + 2;
        }
        map.put(n, res);
        return res;
    }
}