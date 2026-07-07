class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String s=String.valueOf(n);
        if(n==0) return n;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        String ss="";
        for(char ch:s.toCharArray()){
            if(ch!='0') ss+=ch;
        }
        long ans=Integer.valueOf(ss);
        return ans*sum;

        
    }
}