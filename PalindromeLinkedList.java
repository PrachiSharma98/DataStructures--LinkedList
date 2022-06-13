/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Using two algos one for reversing mid of ll and other to find mid of ll and then comparing the data of orig ll with the latter reversed part,if equals then palindrome linked list.
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
       
		if (head == null)
			return true;
		ListNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode rev = reverseLL(slow.next);
		ListNode temp1 = head, temp2 = rev;
		while (temp2 != null) {
			if (temp1.val != temp2.val)
				return false;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;
	}

	private static ListNode reverseLL(ListNode head) {
		if (head == null)
			return null;
		ListNode prev = null, curr = head, next = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
        
    }
