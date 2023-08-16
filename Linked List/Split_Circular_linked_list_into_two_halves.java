/************************************************************

    Following is the linked list node structure
    
    class ListNode<T> {
    T data;
    ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }
}

************************************************************/

public class Solution {
	
	public static void splitCircularList(ListNode<Integer> head) {

        // Write your code here	
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != head && fast.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        ListNode head2 = slow.next;
        slow.next = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = head2;

	}

}