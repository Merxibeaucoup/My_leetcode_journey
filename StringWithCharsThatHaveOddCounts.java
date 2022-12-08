// 1374. Generate a String With Characters That Have Odd Counts

class Solution {
    public String generateTheString(int n) {

        StringBuilder res = new StringBuilder();


        if(n%2 ==0){
            res.append('a');
            n--;
        }

        while(n-- >0){
            res.append(('b'));
        }
        return res.toString();
        
    }
}
