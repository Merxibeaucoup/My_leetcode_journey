// leetcode 12. Integer to Roman


class Solution {
         
    private static final String[] thousands = {"", "M", "MM", "MMM"};
    private static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    
    
    public static String intToRoman(int num) { 
      
      String t = thousands[num / 1000];
      String h =  hundreds[num % 1000 / 100];
      String te = tens[num % 100 / 10];
      String o = ones[num % 10];
      
        return t + h + te + o;
        
    }
}
