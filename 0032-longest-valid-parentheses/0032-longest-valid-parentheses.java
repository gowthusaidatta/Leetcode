class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        if(n<2)return 0;
        int count=0;
       Stack<Integer> stack=new Stack<>();
      stack.push(-1);
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
            stack.push(i);
           }
           else{
            stack.pop();
            if(stack.empty()){
                stack.push(i);
            }
            else{
                count=Math.max(count,i-stack.peek());
            }
           }
        }
        return count;
    }
}