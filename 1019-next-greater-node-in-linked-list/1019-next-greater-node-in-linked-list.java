class Solution {
    public int[] nextLargerNodes(ListNode head) {
    ArrayList<Integer> nums=new ArrayList<>();
    ListNode curr=head;
    while(curr!=null){
        nums.add(curr.val);
        curr=curr.next;
    }
    int n=nums.size();
    int[] ans=new int[n];

    Stack<Integer> stack=new Stack<>();

    for(int i=n-1;i>=0;i--){
        while(!stack.isEmpty() && stack.peek() <= nums.get(i)){
            stack.pop();
        }
        if(!stack.isEmpty())
        ans[i]=stack.peek();

        stack.push(nums.get(i));

    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna