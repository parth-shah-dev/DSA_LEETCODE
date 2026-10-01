class CustomStack {
    int[] stack;
    int index;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.index = -1;
    }
    
    public void push(int x) {
        if (index == maxSize - 1) {
            return;
        }
        index++;
        stack[index] = x;
    }
    
    public int pop() {
        if (index == -1) {
            return -1;
        }
        int val = stack[index];
        index--;
        return val;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, index + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna