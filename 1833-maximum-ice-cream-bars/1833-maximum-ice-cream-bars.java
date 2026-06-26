class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0;
        for(int num:costs){
            if(coins<num)break;
            coins-=num;
            ans++;
        }
        return ans;
    }
}