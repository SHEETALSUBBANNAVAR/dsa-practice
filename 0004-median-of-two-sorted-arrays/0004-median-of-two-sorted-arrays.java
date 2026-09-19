class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int target[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                target[k] = nums1[i];
                i++;
                k++;

            } else {
                target[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            target[k] = nums1[i];
            i++;
            k++;

        }
        while (j < n) {
            target[k] = nums2[j];
            j++;
            k++;

        }
        int l = m + n;
        if (l % 2 == 1) {
            return target[l / 2];
        } else {
            return ((target[(l / 2 - 1)]) + target[(l / 2)]) / 2.0;
        }

    }
}