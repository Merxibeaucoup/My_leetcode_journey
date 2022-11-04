// leetcode 1119. Remove Vowels from a String

/*
Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
*/

class Solution {
    public String removeVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for( char x : s.toCharArray()){
                       
//             if char is not a vowel .. append it to  sb 
          
            if(x!='a'&& x!='e'&& x!='i'&& x!='o'&& x!='u'){
                
                sb.append(x);
            }
               
        }
        
        return sb.toString();
        
    }
}
