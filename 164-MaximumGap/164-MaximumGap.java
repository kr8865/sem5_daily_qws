// Last updated: 7/31/2025, 2:07:07 PM
class Solution {
    public int maximumGap(int[] nums) {
       if (nums.length < 2) return 0;

        // Step 1: Find the minimum and maximum values in the array
        int minVal = nums[0];
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }

        // If all elements are the same, the maximum gap is 0
        if (minVal == maxVal) return 0;

        int n = nums.length;
        // Step 2: Calculate bucket size (at least 1)
        int bucketSize = Math.max(1, (maxVal - minVal) / (n - 1));
        int bucketCount = (maxVal - minVal) / bucketSize + 1;

        // Step 3: Initialize buckets
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        // Step 4: Distribute the elements into buckets
        for (int num : nums) {
            int bucketIndex = (num - minVal) / bucketSize;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
        }

        // Step 5: Calculate the maximum gap
        int maxGap = 0;
        int previousMax = minVal;  // Start with minVal

        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) continue; // Skip empty buckets

            // The gap is the difference between the min of current bucket and max of the previous bucket
            maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }

        return maxGap;
        }
       
       
    }
