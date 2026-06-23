class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq=new int[26];
      int j=0;
      int max=0,m=0;
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        max=Math.max(max,freq[s.charAt(i)-'A']);
        int l=i-j+1;
        if(l-max>k){
            freq[s.charAt(j)-'A']--;
            j++;
        }
        l=i-j+1;
        m=Math.max(l,m);

      }
      return m;
    }
}