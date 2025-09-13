class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a'] ++;
        }
        int maxVow = 0;
        int maxCon = 0;
        for(int i=0;i<26 ;i++){
            char ch = (char) (i+'a');
            if("aeiou".indexOf(ch) != -1){
                maxVow = Math.max(maxVow , freq[i]);

            }else{
                maxCon = Math.max(maxCon , freq[i]);
            }
        }
        return maxVow + maxCon;
        
    }
}