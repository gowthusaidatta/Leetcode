class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] st=startTime.split(":");
        String[] et=endTime.split(":");
        int s=Integer.valueOf(st[0])*3600+Integer.valueOf(st[1])*60+Integer.valueOf(st[2]);
        int e=Integer.valueOf(et[0])*3600+Integer.valueOf(et[1])*60+Integer.valueOf(et[2]);
        return e-s;
    }
}