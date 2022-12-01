// leetcode 2042. Check if Numbers Are Ascending in a Sentence


class Solution {

        public boolean areNumbersAscending(String s) {
        var words = s.split(" ");
        int prev = -1;

        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                int curr = Integer.valueOf(words[i]);
                if (curr <= prev) return false;
                prev = curr;
            }
        }
        return true;
    }
 
}
