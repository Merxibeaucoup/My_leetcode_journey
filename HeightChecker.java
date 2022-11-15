// leetcode 


class Solution {
    public int heightChecker(int[] heights) {

// This Question basically means if natural order or heights is not equal heights ... return the count of heights that are out of order
        // heights:  [1,1,4,2,1,3]
        // expected: [1,1,1,2,3,4]

        // time: o(nlogn)
        // space: o(n)

        int dob []= heights.clone();
        Arrays.sort(dob);

        int counter =0;

        for(int i =0; i < heights.length; i++){
            if (heights[i]!= dob[i]) counter++;
        }

        return counter;


        
    }
}
