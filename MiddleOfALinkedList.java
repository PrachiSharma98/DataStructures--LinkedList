Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3
  
  Will take 2 pointers slow and fast as per algo fast will move by 2 and its assumed that when fast reaches end or beyind at that time wherever slow pointer is the 
  middle element
  
  
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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}
  
  
  
  
