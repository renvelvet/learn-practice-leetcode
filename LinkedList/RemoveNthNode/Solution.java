// Definition for singly-linked list.
/* public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} */

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummyNode = new ListNode(0, head);
      ListNode leftPointer = dummyNode;
      ListNode rightPointer = head;
      
      while (n > 0 && rightPointer != null) {
          rightPointer = rightPointer.next;
          n--;
      }
      while(rightPointer != null) {
          leftPointer = leftPointer.next;
          rightPointer = rightPointer.next;
      }
      
      //remove the nth node 
      leftPointer.next = leftPointer.next.next;
      
      //return the whole updated list
      return dummyNode.next;
  }
}