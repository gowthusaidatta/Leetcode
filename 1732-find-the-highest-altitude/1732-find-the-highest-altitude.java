class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int ans=0,max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            
            sum+=gain[i];
            max=Math.max(sum,max);
            System.out.println(sum);
        }
        return max>-1?max:ans;
    }
}