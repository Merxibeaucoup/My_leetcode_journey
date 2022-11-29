
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap();

        for(int num : arr){
            int oldCount = map.getOrDefault(num, 0);
            map.put(num, oldCount+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int v : map.values()){
            if(set.contains(v)){
                return false;
            }
            set.add(v);
        }

        return true;
        
    }
}
