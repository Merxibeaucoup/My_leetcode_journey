// leetcode 2154

class Solution {
    public int findFinalValue(int[] nums, int original) {
              
//         Hashset to hold array elements 
        Set<Integer> hSet = new HashSet<>();
        
//         add elements to the set 
        for(int i = 0;i< nums.length; i++){
            hSet.add(nums[i]);
}
        
//         loop through set
        for(int k: hSet){
        if (hSet.contains(original)){
            original*=2;
            
}
        }
//         return  answer
            return original;
          
        
    }
}
