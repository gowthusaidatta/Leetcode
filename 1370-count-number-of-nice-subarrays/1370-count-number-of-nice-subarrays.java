class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0,prefix=0;
        HashMap<Integer, Integer> freq=new HashMap<>();
        
        freq.put(0, 1);
        
        for (int num:nums) {
            prefix+=(num % 2);
            count += freq.getOrDefault(prefix- k, 0);
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        
        return count;
    }
}