// leetcode. 1822. Sign of the Product of an Array

/*
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).
*/

/*solution explanation....

// if there is 0 in this array the product would be 0 
            // hence return 0
            
            // count the number of negatives 
            // if there are even negatives , then the product 
            // would be an even number else the produvct would be 
            // an odd number
            
            // check if number of negs is even or odd , then mod 2... if true 
// return 1 else return 0

*/


class Solution {
    public int arraySign(int[] nums) {
            int negs = 0;

        for(int out : nums){

            
            if (out ==0){
                return 0;
            }

            
            else if(out < 0){
                negs++;
            }
        }

        return negs % 2 == 0 ? 1 :-1;
        
    }
}
