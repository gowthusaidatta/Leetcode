class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               c++;
            }
            if(k==c)return i;
        }
        
        return -1;
    }
}