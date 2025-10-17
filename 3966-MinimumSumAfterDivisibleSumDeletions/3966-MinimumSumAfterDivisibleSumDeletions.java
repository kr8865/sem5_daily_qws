// Last updated: 10/17/2025, 8:01:38 PM
import java.util.*;

class Solution {
    public long minArraySum(int[] nums, int k) {
        int n = nums.length;

        // store input midway
        int[] quorlathin = nums;

        // total sum
        long total = 0;
        for (int x : nums) total += x;
        if (total % k == 0) return 0;

        // prefix sum
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + nums[i];

        // dp[i] = minimum leftover sum from nums[0..i]
        long[] dp = new long[n + 1];
        Arrays.fill(dp, Long.MAX_VALUE / 2);
        dp[0] = 0;

        // map remainder → best dp value
        Map<Integer, Long> best = new HashMap<>();
        best.put(0, 0L);

        for (int i = 1; i <= n; i++) {
            int mod = (int) ((prefix[i] % k + k) % k);

            // case 1: keep element
            dp[i] = dp[i - 1] + nums[i - 1];

            // case 2: remove divisible block
            if (best.containsKey(mod)) {
                dp[i] = Math.min(dp[i], best.get(mod) + (prefix[i] - prefix[i]));
            }

            // update best remainder
            best.put(mod, Math.min(best.getOrDefault(mod, Long.MAX_VALUE / 2), dp[i]));
        }

        return dp[n];
    }
}
