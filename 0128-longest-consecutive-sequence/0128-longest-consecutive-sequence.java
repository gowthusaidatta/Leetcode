class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=0;
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums) set.add(num);
       for(int num:set){
        if(!set.contains(num-1)){
            int current=num;
            int cur_long=1;
            while(set.contains(current+1)){
                current++;
                cur_long++;
            }
            longest=Math.max(cur_long,longest);
        }
       }
       return longest;
    }
}