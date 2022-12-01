// leetcode 1460. Make Two Arrays Equal by Reversing Subarrays

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int [] freq = new int [1001];

        for(int n : target)freq[n]++;
        for(int v : arr)freq[v]--;

        for(int f : freq){
            if(f !=0) return false;
        }
         return true;
        
    }
}
