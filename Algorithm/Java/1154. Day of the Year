class Solution {
    public int dayOfYear(String date) {
        int year = (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0') * 100 
                    + (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0'); 
        int month = (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0');
        int day = (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
        boolean run = false;
        
        // int[] dayPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int res = 0;

        if(year % 400 == 0) run = true;
        if(year % 4 == 0 && year % 100 != 0) run = true;

        for (int i = 0; i < month - 1; ++i) {
            switch(i+1) {
                case 1: res += 31; break;
                case 2: res += 28; break;
                case 3: res += 31; break;
                case 4: res += 30; break;
                case 5: res += 31; break;
                case 6: res += 30; break;
                case 7: res += 31; break;
                case 8: res += 31; break;
                case 9: res += 30; break;
                case 10: res += 31; break;
                case 11: res += 30; break;
                case 12: res += 31; break;
            }
        }
        res += day;

        if (run && month > 2) res += 1;

        return res;
    }
}
