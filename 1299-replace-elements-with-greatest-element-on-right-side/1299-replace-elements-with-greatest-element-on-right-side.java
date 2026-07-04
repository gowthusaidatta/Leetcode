class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
      int n=arr.length;
      int[] ans=new int[n];
      for(int i=n-1;i>=0;i--){
        ans[i]=max;
        max=Math.max(max,arr[i]);
      }
      int i=0,j=ans.length-1;
   
      return ans;
    }
   
}