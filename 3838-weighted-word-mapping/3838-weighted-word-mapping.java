class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(char ch:word.toCharArray()){
                sum+=weights[ch-'a'];
            }
            int ans=sum%26;
            s.append((char)('z'-ans));
        }
        return s.toString();
    }
}