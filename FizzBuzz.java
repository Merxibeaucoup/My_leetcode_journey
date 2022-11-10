// leetcode 412. Fizz Buzz

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/


class Solution {
    public List<String> fizzBuzz(int n) {


        ArrayList<String> ans = new ArrayList<>();


       for(int i =1; i <= n ; i ++){
           

           boolean divby5 = (i %5==0);
           boolean divby3 = (i %3==0);

            if (divby3 && divby5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divby3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divby5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(i));
            }
        }

        return ans;
        
    }
}
