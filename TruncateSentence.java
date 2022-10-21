// leetcode 1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        
        String [] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        String nSen ="";
        
        for(int i =0; i<k; i++){            
            sb.append(words[i]+ " ");
             nSen = sb.toString();
}
        
        return nSen.trim();
        
        
    }
}
