// leetcode 1859

class Solution {
   public  String sortSentence(String str1) {
//      puts each word in an array index excluding the space
        String[] str = str1.split(" ");
        Map<Integer,String> map = new TreeMap<>();
        //automatically it will sort the indexes for you
        for(String s: str) {
          //get substring index
          int subIndex = s.length()-1;
          // Integer.valueOf returns a Integer instance representing the specified string
           map.put(Integer.valueOf(s.substring(subIndex)), s.substring(0,subIndex));
        }
        
        // string builder name is self explanatory
         StringBuilder sb = new StringBuilder();
         
         //loop the map values 
        for(String s : map.values()) {
          
          //append each value to sb +" " after each value 
            sb.append(s+" ");
        }
        // return created string .trim() ==> remove trailing spaces.
        return sb.toString().trim();
    }
}
