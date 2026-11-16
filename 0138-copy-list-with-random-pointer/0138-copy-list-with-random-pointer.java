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
        if (head == null) return null;

        
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            Node clone = new Node(curr.val);
            curr.next = clone;
            clone.next = nextNode;
            curr = nextNode;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

       
        curr = head;
        Node pseudoHead = new Node(0);
        Node copyCurr = pseudoHead;

        while (curr != null) {
            Node nextNode = curr.next.next;
            
            
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;
            
            
            curr.next = nextNode;
            
            curr = nextNode;
        }

        return pseudoHead.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna