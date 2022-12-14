// leetcode 1108. Defanging an IP Address

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/

// Method 1 using sb and if-else
class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for(char s : address.toCharArray()){

            if(s=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(s);
            }
        }

        return sb.toString();
        
    }
}

// Methode 2 using replace method
class Solution {
    public String defangIPaddr(String address) {

        return address.replace(".","[.]");
              
    }
}
