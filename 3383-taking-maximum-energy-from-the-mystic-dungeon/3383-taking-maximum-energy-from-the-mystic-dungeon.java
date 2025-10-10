class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        
        for (int i = n - k - 1; i >= 0; i--) {
            energy[i] += energy[i + k];
        }
        
        int maxEnergy = Integer.MIN_VALUE;
        for (int e : energy) {
            maxEnergy = Math.max(maxEnergy, e);
        }
        
        return maxEnergy;

    }
}