// when there is loop at first head add following condition
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(ListNode head){
        ListNode fast = head ;
        ListNode slow = head ;
        
       while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        if(slow == head){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
        }else if(slow == fast){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;    
            }
            fast.next = null;
        }
    }
}
