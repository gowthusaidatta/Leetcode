class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] c = new int[128];
        Arrays.fill(c,-1);
       int  j=0;
       int maxlen=0;
        for(int i=0;i<n;i++){
            if(c[s.charAt(i)]>=j){
                j=c[s.charAt(i)]+1;
            }
            c[s.charAt(i)]=i;
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}