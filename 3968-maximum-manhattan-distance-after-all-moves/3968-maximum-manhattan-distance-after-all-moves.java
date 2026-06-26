class Solution {
    public int maxDistance(String moves) {
        int any=0,h=0,v=0;
        for(char ch:moves.toCharArray()){
            if(ch=='_') any++;
            else if(ch=='R') h++;
            else if(ch=='L') h--;
            else if(ch=='U') v++;
            else if(ch=='D') v--;
        }
        int ans= Math.abs(h-0)+Math.abs(v-0);
        return ans+any;
    }
}