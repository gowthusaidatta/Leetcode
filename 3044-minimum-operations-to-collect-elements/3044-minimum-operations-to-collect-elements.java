import java.util.*;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> collected = new HashSet<>();
        int operations = 0;

        // Traverse from end to start
        for (int i = nums.size() - 1; i >= 0; i--) {
            operations++;
            int num = nums.get(i);
            
            // Collect if it's between 1 and k
            if (num <= k) {
                collected.add(num);
            }

            // If we have all numbers 1..k, stop
            if (collected.size() == k) {
                break;
            }
        }

        return operations;
    }
}
