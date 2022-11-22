// leetcode 2351. First Letter to Appear Twice


class Solution {
    public char repeatedCharacter(String s) {

       HashSet <Character> h1 = new HashSet<>();
    
    for(int i=0 ; i<s.length(); i++ ){
        if(h1.contains(s.charAt(i))){
            return s.charAt(i);
        }
        else{
            h1.add(s.charAt(i));
        }
    }
    return '0';
    
}
}
