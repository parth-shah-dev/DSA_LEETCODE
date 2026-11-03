class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k==0)
            return head;
        ListNode curr=head;
        int length=1;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        k=k%length;
        if(k==0) return head;
        curr.next=head;
        ListNode newcurr=head;
        int steps=length-k;
        for(int i=1;i<steps;i++){
            newcurr=newcurr.next;
        }
        ListNode newhead=newcurr.next;
        newcurr.next=null;
        return newhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna