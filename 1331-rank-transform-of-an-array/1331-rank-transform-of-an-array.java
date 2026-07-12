class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] nums = arr.clone();
       Arrays.sort(nums);
       int[] ans=new int[arr.length];
       Map<Integer,Integer> map=new HashMap<>();
       int rank=1;
       for(int n:nums){
        if(!map.containsKey(n)){
            map.put(n,rank++);
        }
       }
       for(int i=0;i<arr.length;i++){
        ans[i]=map.get(arr[i]);
       }
       return ans;
    }
}