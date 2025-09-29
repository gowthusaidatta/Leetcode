class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicate j

                long target2 = (long)target - nums[i] - nums[j]; // use long to avoid overflow
                int left = j + 1, right = n - 1;

                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target2) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // skip duplicates for left and right
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target2) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
