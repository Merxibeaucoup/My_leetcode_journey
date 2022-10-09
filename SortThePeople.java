class Solution {
  public String[] sortPeople(String[] names, int[] heights) {
           
        
//       new  Array to hold output 
        String [] result = new String[names.length];
        
        //use a treemap , its sorted based on keys 
        //reverse the order of sort -> descending order
        TreeMap <Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
        
        
        //put height and name pairs in the map
        for(int i =0; i<names.length; i++){
            tm.put(heights[i], names[i]);
}
        
        //initialize index for output array , start at [0]
        int i =0;
        //get each key from set 
        for(int key : tm.keySet()){
            //retrieve value by key and push it in the output array 
            result[i++]= tm.get(key);
}
        return result;
        
    }
}
