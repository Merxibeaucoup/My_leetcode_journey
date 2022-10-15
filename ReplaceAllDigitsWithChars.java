// leetcode 1844

class Solution {
    public String replaceDigits(String s) {
        
//         convert string to a char array 
//         to make sure we can touch each element of string 
        char[] c = s.toCharArray();

        
//         per the question, loop to only odd indexes 
//         hence i starts at 1, and ...incremented by +2
    for (int i = 1; i < c.length; i += 2)
        
//         at c[i] an odd element 
//         add c[i] + the previous element - '0'( ascii 48) 
      c[i] += (char) (c[i - 1] - '0');

    return String.valueOf(c);
  }
}
  
