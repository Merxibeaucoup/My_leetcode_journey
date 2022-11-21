// 1832. Check if the Sentence Is Pangram

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, 
return true if sentence is a pangram, or false otherwise.
*/



class Solution {
    public boolean checkIfPangram(String sentence) {

       Set set = new HashSet();

       for(char c : sentence.toCharArray()){
           set.add(c);
       }

       return set.size() == 26 ? true: false;
        
    }
}
