class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] != 1){
                int start = nums[i-1] +1;
                int end = nums[i];
                while(start < end){
                    list.add(start);
                    start++;
                }
            }
        }
        return list;
    }
}