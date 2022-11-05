// leetcode 1512. Number of Good Pairs

/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/

//Optimal  Method 1 using HashMap

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int res =0;
        
        /*
            declare hashMap
        */
        HashMap<Integer, Integer> map = new HashMap();

        /*
           Loop through array
        */
        
        for(int num : nums){
            
        /*
            K,V
            put pairs in map
            num as key 
            getOrDefault().... means get num and count it +1 , else num = 0

        */
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key: map.keySet()){
            int val =map.get(key);

            if(val>1){
                    res+= (val *(val-1))/2;
            }
        }
    

return res;
        
    }
}

// Optimal Method 2 using freq array

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count =0;

        int freq [] = new int [101];

        for(int n: nums){

            count+=freq[n]++;
        }
        return count;
        
    }
}

