// leetcode 1480 

// method 1

class Solution {
    public int[] runningSum(int[] nums) {

        int res [] = new int [nums.length];

        int sum =0;

        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
            res[i]= sum;
        }

        return res;
        
    }
}


// method 2

class Solution {
    public int[] runningSum(int[] nums) {

        for(int i =1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
        
    }
}
