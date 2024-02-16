//Definition for singly-linked list.
/* public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
} */

public class Solution {
   public static int getLength (ListNode list) {
       int len = 0;
       for(ListNode curr = list; curr != null; curr = curr.next) {
           len++;
       }
       return len;
   }
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int lenA = getLength(headA);
       int lenB = getLength(headB);
       ListNode longer = headA;
       ListNode shorter = headB;
       int steps = 0;
       
       if(lenA > lenB) {
           steps = lenA - lenB;
       } else {
           steps = lenB - lenA;
           longer = headB;
           shorter = headA;
       }
       
       
       for(int i = 0; i < steps; i++) {
           longer = longer.next;
       }
       
       while(longer != shorter) {
           longer = longer.next;
           shorter = shorter.next;
       }
       return longer;
   }
}