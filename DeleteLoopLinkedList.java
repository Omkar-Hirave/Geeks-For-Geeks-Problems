class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node fast = head ;
        Node slow = head ;
        
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