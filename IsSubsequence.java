// leetcode 392. Is Subsequence

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.


Input: s = "abc", t = "ahbgdc"
Output: true


*/
class Solution {
    public boolean isSubsequence(String s, String t) {
    if (s.isEmpty())
      return true;

    int i = 0;
    for ( char c : t.toCharArray())
      if (s.charAt(i) == c && ++i == s.length())
        return true;

    return false;
  }
}
