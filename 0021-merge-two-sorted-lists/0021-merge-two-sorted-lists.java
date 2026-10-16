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
    public ListNode mergeTwoLists(ListNode List1, ListNode List2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(List1!=null && List2!=null){
            if(List1.val<=List2.val){
                curr.next=List1;
                List1=List1.next;
            }else{
                curr.next=List2;
                List2=List2.next;
            }
            curr=curr.next;
        }
        if(List1!=null){
            curr.next=List1;
        }
        if(List2!=null){
            curr.next=List2;
        }
    return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna