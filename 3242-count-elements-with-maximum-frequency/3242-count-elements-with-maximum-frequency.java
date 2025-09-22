class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; // nums[i] ≤ 100
        int maxFreq = 0;

        // Count frequencies
        for (int num : nums) {
            freq[num]++;
            maxFreq = Math.max(maxFreq, freq[num]);
        }

        int total = 0;
        // Sum frequencies of elements having maxFreq
        for (int f : freq) {
            if (f == maxFreq) {
                total += f;
            }
        }
        return total;
    }
}
