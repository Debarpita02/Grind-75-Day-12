public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<ListNode>();
        while(head != null) {
            if(visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.next;
        }
        return false;
    }
}