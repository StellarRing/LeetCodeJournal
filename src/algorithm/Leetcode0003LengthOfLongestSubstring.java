package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author WangCheng
 * @version 1.0
 * @Date 2018/8/16 16:05
 */
public class Leetcode0003LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        List<Character> strList = new ArrayList<>(s.length());
        int maxLength = 0;
        char[] strChar = s.toCharArray();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            strList.add(strChar[i]);
            n++;
            for (int j = i + 1; j < s.length(); j++) {
                char temp = strChar[j];
                //字符是否已经出现在子串中，如果已出现，从下一个子串头开始
                if (strList.contains(temp)) {
                    if (maxLength <= n) {
                        maxLength = n;
                    }
                    strList.clear();
                    n = 0;
                    break;
                }
                strList.add(temp);
                n++;
            }
            //只读取最大子串长度，读取完长度后从下一个下标开始读取
            if (maxLength < n) {
                maxLength = n;
            }
            strList.clear();
            n = 0;
        }
        if (maxLength <= n) {
            maxLength = n;
        }
        return maxLength;
    }
}
