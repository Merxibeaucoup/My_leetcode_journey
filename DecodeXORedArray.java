class Solution {
    public int[] decode(int[] encoded, int first) {
        
// length of decoded array  is encoded + 1
        int decoded[] = new int [encoded.length+1];
        
//         first index is  decoded[0]= first .. will be provided 
        decoded[0] =first;
        
        //loop through encoded array 
        for(int i =0; i<encoded.length; i++){
            // calculate Xor 
            int calc = decoded[i]^ encoded[i];
            //and insert to decode except at [0]
            decoded[i+1]= calc;
}
        return decoded;
        
    }
}
