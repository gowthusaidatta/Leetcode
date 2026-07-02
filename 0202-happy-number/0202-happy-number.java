class Solution {
    public boolean isHappy(int n) {
        int s=n;
        Set<Integer> set=new HashSet<>();
        while(s!=1){
            s=sq(s);
            if(set.contains(s)){
                return false;
            }
            set.add(s);
        }
        return true;

    }
    private int sq(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp;
            n/=10;
        }
        return sum;
    }

}