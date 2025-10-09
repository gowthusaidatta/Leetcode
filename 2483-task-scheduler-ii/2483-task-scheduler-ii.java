class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> lastDone = new HashMap<>();
        long day = 0;

        for (int task : tasks) {
            day++; // move to the next day
            if (lastDone.containsKey(task)) {
                long prevDay = lastDone.get(task);
                if (day <= prevDay + space) {
                    day = prevDay + space + 1; // wait until it's valid to do again
                }
            }
            lastDone.put(task, day);
        }

        return day;
    }
}