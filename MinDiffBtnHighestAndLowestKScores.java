// my brute force solution 
// this works by sorting array then reversing it(no negative subtractions) 
// finds minimum difference 

class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        int minNum = 0;
        int calc =0;
        Arrays.sort(nums, Collections.reverse());
        
        for(int i =0; i< nums.length; i++)
            for(int j =i+1; j<nums.length; j++)
        {
           calc= nums[i]- nums[j];
                if(minNum> calc)
                    minNum =calc;                  
                
        }
         return minNum;
        
    }
}



// optimal solution

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1){
          return 0; 
       }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i = k-1;i<nums.length;i++){
            diff = nums[i] - nums[i-(k-1)];
            min = Math.min(min,diff);
        }
        return min;
    }
}





