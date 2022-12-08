// leetcode 1598. Crawler Log Folder


class Solution {
    public int minOperations(String[] logs) {

        Stack stack = new Stack();

        for(String l : logs){

            if(l.equals("../")){
                if(!stack.isEmpty())
                stack.pop();
            }

            else if(l.equals("./")) {
                    continue;
            }
            else{
                stack.add(l);
            }

        }




        return stack.size();
        
    }
}
