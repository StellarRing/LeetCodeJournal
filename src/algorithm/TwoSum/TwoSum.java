package algorithm.TwoSum;

/**
 * Description:
 * 两数之和
 *
 * @author WangCheng
 * @version 1.0
 * @Date 2018/8/15 14:03
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
