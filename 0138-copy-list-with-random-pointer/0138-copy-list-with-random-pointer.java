/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        HashMap<Node,Node> old=new HashMap<>();
        Node curr = head;
        while(curr!=null){
            old.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            old.get(curr).next=old.get(curr.next);
            old.get(curr).random=old.get(curr.random);
            curr=curr.next;
        }
        return old.get(head);
    }
}