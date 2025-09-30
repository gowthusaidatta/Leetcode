import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        
        Collections.sort(list, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA == countB) {
                return a - b; 
            }
            return countA - countB; 
        });
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
