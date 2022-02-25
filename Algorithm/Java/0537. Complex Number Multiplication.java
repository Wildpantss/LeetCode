class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        // parse num1 and num2
        int real1 = Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int imag1 = Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.length()-1));
        int real2 = Integer.parseInt(num2.substring(0,num2.indexOf('+')));
        int imag2 = Integer.parseInt(num2.substring(num2.indexOf('+')+1,num2.length()-1));

        // multiply
        int real = real1 * real2 - imag1 * imag2; 
        int imag = real1 * imag2 + real2 * imag1;

        // make string and return
        return real + "+" + imag + "i";
    }
}
