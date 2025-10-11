class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count[] =new int[26];
        for(char C: tasks){
            count[C -'A']++;
        }
        Arrays.sort(count);
        int maxC=count[25];

        int freq=0;

        for(int i=25;i>=0;i--){
            if(count[i]==maxC)freq++;
            else break;
        }
        int minC=(maxC-1)*(n+1)+freq;

        return Math.max(minC,tasks.length);
    }
}