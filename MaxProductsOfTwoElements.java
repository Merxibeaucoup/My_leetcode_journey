// leetcode 1464 . Maximum Product of Two Elements in an Array

/*
Given the array of integers nums, 
you will choose two different indices i and j of that array. 
Return the maximum value of (nums[i]-1)*(nums[j]-1).


// basically the product of thr two max nums each -1
 
*/


class Solution {
    public int maxProduct(int[] nums) {

        int firstMax =0;
        int secondMax = firstMax;

        for(int out : nums){
            if(out > firstMax){
                secondMax = firstMax;
                firstMax= out;
            }
            else if(out >secondMax){
                secondMax = out;

            }
        }

        return ((firstMax-1)*(secondMax-1));
        
    }
}
