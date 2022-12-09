// leetcode 1550. Three Consecutive Odds



// Method 1

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int counter = 0;
        // time: 0(n)
        // space: 0(1)

       for(int n : arr){
           counter = (counter + 1) * (n&1);
           if (counter ==3) return true;
       }

        return false;
        
    }
}





// Method 2

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int counter = 0;

       for(int n : arr){
           if(n % 2 !=0){
              counter++;
              if(counter ==3 ) return true;
           } 
           else{
               counter=0;
           }
       }

        return false;
        
    }
}
