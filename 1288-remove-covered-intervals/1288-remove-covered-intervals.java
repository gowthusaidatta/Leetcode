class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       int count = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
          if (a[0] != b[0]) {
            return Integer.compare(a[0], b[0]);
             }
            return Integer.compare(b[1], a[1]);
         });
        for(int i=0;i<intervals.length;i++){
            }
       
        int max = intervals[0][1];
        for(int i=1;i<intervals.length ; i++){
            if(intervals[i][1] <= max){
                count--;
            }
            max = Math.max(max , intervals[i][1]);
        }
        return count;
    }
}