// leetcode 1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        
//         spilt entire sentence into an array
        String [] words = s.split(" ");
//         String builder , self explanatory
        StringBuilder sb = new StringBuilder();
//         to hold new sentence
        String nSen ="";
//         loop k times 
        for(int i =0; i<k; i++){   
//             append each element + an empty space after 
            sb.append(words[i]+ " ");
//             assign sb to nSen
             nSen = sb.toString();
}
//         remove trailing spaces.
        return nSen.trim();
        
        
    }
}
