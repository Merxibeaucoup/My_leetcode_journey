class Solution {
   public int maximumDifference(int[] nums) 
    {
      //initiate max incase of decreasing array ...
     //so max =-1 .. if theres no maximum difference such that nums[i] < nums[j]
        int max=-1;
     
     // this starts checking for [0]
     int lastindex=0;
        for (int i = 1; i < nums.length; i++)
        {
          
            if (nums[i]>nums[lastindex])
              //update max value 
                max=Math.max(max,nums[i]-nums[lastindex]);
            else
              // else update lastindex to use to test 
                lastindex=i;
        }
        return max;
    }
}
