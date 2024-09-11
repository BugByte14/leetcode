/*
24. Swap Nodes in Pairs
Medium
Topics
Companies

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)


Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Example 4:
Input: head = [1,2,3]
Output: [2,1,3]


Constraints:

    The number of nodes in the list is in the range [0, 100].
    0 <= Node.val <= 100

*/
/*
Time Complexity: O(n)
Runtime: 0ms
Memory: 42.25MB
*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class 0024 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return new ListNode(head.next.val, new ListNode(head.val, swapPairs(head.next.next)));
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode newTest = swapPairs(test);
        for (ListNode i = newTest; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }
}