/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size() == 0) return 0;
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for(int i = 0 ; i < intervals.size(); i++){
            if(pq.isEmpty()) pq.add(intervals.get(i).end);
            else if(pq.peek() <= intervals.get(i).start){
                pq.poll();
                pq.add(intervals.get(i).end);
            }
            else{
                pq.add(intervals.get(i).end);
            }
            ans = Math.max(ans, pq.size());
        }
        return ans;
    }
}
