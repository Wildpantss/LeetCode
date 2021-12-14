class Solution {
    public String originalDigits(String s) {
        // zero - signature: z
        // one - 
        // two - signature: w
        // three - 
        // four - 
        // five - 
        // six - signature: x
        // seven - 
        // eight - signature: g
        // nine - 

        char[] charArray = s.toCharArray();
        int[] counterMap = new int[26];
        int[] numMap = new int[10];
        for (char ch : charArray) {
            counterMap[ch - 'a'] ++;
        }

        numMap[0] = counterMap['z' - 'a'];
        numMap[8] = counterMap['g' - 'a'];
        numMap[2] = counterMap['w' - 'a'];
        numMap[6] = counterMap['x' - 'a'];
        numMap[3] = counterMap['t' - 'a'] - numMap[2] - numMap[8];
        numMap[7] = counterMap['s' - 'a'] - numMap[6];
        numMap[4] = counterMap['r' - 'a'] - numMap[3] - numMap[0];
        numMap[1] = counterMap['o' - 'a'] - numMap[4] - numMap[2] - numMap[0];
        numMap[5] = counterMap['v' - 'a'] - numMap[7];
        numMap[9] = counterMap['i' - 'a'] - numMap[8] - numMap[6] - numMap[5];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < numMap[i]; ++j) sb.append(i);
        }

        return sb.toString();
    }
}