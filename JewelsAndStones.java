// 771. Jewels and Stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int ans =0;

        HashSet<Character> set = new HashSet<>();
      
      
        //add chars of jewels to the hashset
        for(char jc : jewels.toCharArray()){
            set.add(jc);
        }
      
      
      
        /*loop through chars of stones
        check if stone char is in the set 
        then increase count
        */
        for( char sc : stones.toCharArray()){
            if(set.contains(sc)){
                ans++;
            }
        }


        return ans;
        
    }
}
