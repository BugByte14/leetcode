/*
203. Remove Linked List Elements
Easy
Topics
Companies

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

    The number of nodes in the list is in the range [0, 104].
    1 <= Node.val <= 50
    0 <= val <= 50

*/
/*
Time Complexity: O(n)
Runtime: 2ms
Memory: 50MB
*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class 0203 {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {return head;}
        if (head.val == val) {head = removeElements(head.next, val);}
        else {head.next = removeElements(head.next, val);}
        return head;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode newTest = removeElements(test, 6);
        for (ListNode i = newTest; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }
}