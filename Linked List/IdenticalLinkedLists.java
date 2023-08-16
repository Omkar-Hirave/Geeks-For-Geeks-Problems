/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node current1 = head1;
        Node current2 = head2;
        while(current1 != null && current2 != null){
            if(current1.data != current2.data){
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return (current1 == null && current2 == null) ? true :false;
    }
}