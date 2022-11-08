// leetcode 1365. How Many Numbers Are Smaller Than the Current Number

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

       int [] freq = new int[101];

       for(int n: nums){
        //    at n occurence , increment frequency seen at
           freq[n]++;
       }

       for(int i=1; i < freq.length; i++){
        //    running sum of freq array 
           freq[i] += freq[i-1];
       }

       for(int i=0; i <nums.length; i++){
           if(nums[i]!=0){
               nums[i] = freq[nums[i]-1];
           }
       }

       return nums;
        
    }
}
