class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int[] best = new int[k];
        boolean first = true;

        int start = Math.max(0, k - n);
        int end = Math.min(k, m);

        for (int i = start; i <= end; i++) {
            int[] sub1 = maxSubsequence(nums1, i);
            int[] sub2 = maxSubsequence(nums2, k - i);
            int[] candidate = merge(sub1, sub2, k);

            if (first || isGreater(candidate, 0, best, 0)) {
                best = candidate;
                first = false;
            }
        }

        return best;
    }

    
    private int[] maxSubsequence(int[] nums, int len) {
        int[] res = new int[len];
        int top = 0;
        int drop = nums.length - len;

        for (int num : nums) {
            while (top > 0 && res[top - 1] < num && drop > 0) {
                top--;
                drop--;
            }
            if (top < len) {
                res[top++] = num;
            } else {
                drop--;
            }
        }
        return res;
    }

   
    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        int i = 0, j = 0, idx = 0;

        while (idx < k) {
            if (isGreater(nums1, i, nums2, j)) {
                res[idx++] = nums1[i++];
            } else {
                res[idx++] = nums2[j++];
            }
        }
        return res;
    }

    private boolean isGreater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        if (j == nums2.length) return true;
        if (i == nums1.length) return false;
        return nums1[i] > nums2[j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna