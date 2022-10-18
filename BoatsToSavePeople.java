class Solution {
    public int numRescueBoats(int[] people, int limit) {
//         sort
        Arrays.sort(people);
        
//       two pointers 
//       one to start at index 0
//       and other to start at last index 
        int left =0;
        int right= people.length-1;
        int numsBoat =0;

//       while people still left on the island 
        while(left<=right){
//           if true , move  from left and right 
            if(people[left]+ people[right] <= limit){
              
                left++;
                right--;
}
            else{
//               else only move from right 
                right--;
}
//           increment # of boats used 
            numsBoat++;
}
        return numsBoat;
        
    }
}
