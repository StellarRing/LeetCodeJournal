package algorithm;

/**
 * Description:
 *
 * @author WangCheng
 * @version 1.0
 * @Date 2018/8/16 18:54
 */
public class Leetcode0004FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int cursor1 = 0;
        int cursor2 = 0;
        int length = nums1.length + nums2.length;
        int boundary = length / 2 + 1;
        int[] arr = new int[boundary];
        for (int i = 0; i < boundary; i++) {
            if (cursor1 < nums1.length && cursor2 < nums2.length) {
                if (nums1[cursor1] < nums2[cursor2]) {
                    arr[i] = nums1[cursor1++];
                } else {
                    arr[i] = nums2[cursor2++];
                }

            } else {
                if (cursor1 < nums1.length) {
                    arr[i] = nums1[cursor1++];
                }
                if (cursor2 < nums2.length) {
                    arr[i] = nums2[cursor2++];
                }
            }
        }
        if ((length & 1) == 0) {
            return ((double) arr[boundary - 1] + (double) arr[boundary - 2]) / 2.0;
        } else {
            return (double) arr[boundary - 1] / 1.0;
        }
    }

}
