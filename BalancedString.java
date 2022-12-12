// 1221. Split a String in Balanced Strings

// Brute force solution

// Method 1

class Solution {
    public int balancedStringSplit(String s) {
        
        int count =0;
        int r =0;
        int l = 0;
        
        for(int i =0; i<s.length(); i++){
            
            if(s.charAt(i) == 'R'){

                r++;
                
            }
            else {
                
                 l++;
            }
             if(r==l) {

                 count++;
                 r=0;
                 l=0;
             } 

        }
        return count;
        
    }
}



// Method 2 

class Solution {
    public int balancedStringSplit(String s) {

        int res =0;

        int balance = 0;

        for(char c : s.toCharArray()){

            if(c =='R'){
                balance++;
            }
            else if(c =='L'){
                balance--;
            }

            if(balance ==0){
                res++;
            }
        }

        return res;
        
    }
}
