class Solution {
    private boolean zero(int num){
        if(num == 0) return false;
        while(num > 0){
            if(num % 10 ==0){
                return false;   //if contains zero
            }
            num = num/10;
        } 
        return true;   /// if it not contains zero 
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i=1;i<n;i++){
            ans[0] = i;
            ans[1] = n-i;

            boolean checkA = zero(ans[0]);
            boolean checkB = zero(ans[1]);
            if(checkA && checkB){
                break;  // it satisfys only when they not contains zero in it
            }
        }
        return ans;
    }
}