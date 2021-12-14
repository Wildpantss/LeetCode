class Solution {
    public int superPow(int a, int[] b) {
        java.math.BigInteger bigA = java.math.BigInteger.valueOf(a);
        StringBuilder sb = new StringBuilder();
        for(int i : b){
            sb.append(i);
        }
        java.math.BigInteger bigB = new java.math.BigInteger(sb.toString());
        java.math.BigInteger res = bigA.modPow(bigB, new java.math.BigInteger("1337"));
        return res.intValue();
    }
}