//My brute force solution, accepted output by leetcode but exceeded time limit .. time complexity is On^2..badd!
//Approach #1
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        boolean answer = false;
        
        for (int i =0; i<nums.length; i++)
        for(int j = i+1; j<nums.length; j++){
            Arrays.sort(nums);
            
            if(nums[i]==nums[j]){
                answer = true;   
            }
           
        }
        return answer;
        
    }
}

// My second solution   ... time complexity is O(nlogn) ,, sorting is O(nlogn)
// Approach #2 , works perfectly fine because i switched the position of the sort algo .... sort before loop

public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]){ return true;}
    }
    return false;
}

//Approach #3 
//leetcode optimal solution is to use  search and insert logic , 
// use a hashset 
//check if set contains element[i] if yes return true , add element[i] to set .. else return false.

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
