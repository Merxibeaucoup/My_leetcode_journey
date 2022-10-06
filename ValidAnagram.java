class Solution {
    public boolean isAnagram(String s, String t) {
//         if not saame length return false
       if(s.length() != t.length()){
           return false;
        }
        
        //define char array and turn strings to char array 
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        //sort Arrays
        Arrays.sort(charS);
        Arrays.sort(charT);
        
        // return true if S==T
        return Arrays.equals(charS, charT);
        
    }
}
