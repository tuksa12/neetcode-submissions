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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int right = list.size() - 1;
        int left = 0;
        while (left < right) {
            list.get(left).next = list.get(right);
            left++;

            if (left == right) {
                break;
            }
            list.get(right).next = list.get(left);
            right--;

        }
        list.get(left).next = null;
        return;
    }
}
