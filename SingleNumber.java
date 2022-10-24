// leetcode 136. Single Number

// Optimal solution

class Solution {
    public int singleNumber(int[] nums) {
       int ans =0;
        for(int n: nums){
// using xOR .. it removes a number if its already been seen.
            ans ^= n; 
        }
        return ans;
    }
}




// brute force solution

class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet <Integer> hSet = new HashSet<>();
        
        int ans =0;
        
        for(int n : nums){
           if(hSet.contains(n)){
               hSet.remove(n);
           }
            else{
                hSet.add(n);
            }
        }
        
        for(int h : hSet){
            ans =h;
        }
        
        return ans;
        
    }
}
