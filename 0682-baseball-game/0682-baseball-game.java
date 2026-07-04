class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < op.length; i++) {
            String curr = op[i];

            if (curr.equals("C")) {
                st.pop();
            } 
            else if (curr.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (curr.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } 
            else {
                st.push(Integer.parseInt(curr));
            }
        }

        int sum = 0;
        for (int num : st) {
            sum += num;
        }

        return sum;
    }
}