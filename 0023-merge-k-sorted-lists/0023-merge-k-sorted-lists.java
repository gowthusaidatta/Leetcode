/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Edge case: if list array is empty or null
        if (lists == null || lists.length == 0) return null;

        // Min-heap based on node values
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each list into the heap
        for (ListNode list : lists) {
            if (list != null) pq.add(list);
        }

        // Dummy node to build the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // While heap is not empty, get smallest node
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = tail.next;

            // Add the next node from that list (if any)
            if (node.next != null) pq.add(node.next);
        }

        return dummy.next;
    }
}
