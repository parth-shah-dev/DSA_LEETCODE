class Solution {
    public int pairSum(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
   while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
    ListNode prev=null;
    while(slow!=null){
        ListNode next=slow.next;
        slow.next=prev;
        prev=slow;
        slow=next;
    }
    int ans=0;
    while(prev!=null){
        ans=Math.max(ans,head.val+prev.val);
        head=head.next;
        prev=prev.next;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna