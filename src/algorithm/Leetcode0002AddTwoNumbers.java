package algorithm;

import algorithm.bean.ListNode;

/**
 * Description:
 * 两数之和
 *
 * @author WangCheng
 * @version 1.0
 * @Date 2018/8/15 14:03
 */
public class Leetcode0002AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cursor1 = l1;//链表1游标
        ListNode cursor2 = l2;//链表2游标
        int curVal;//两数之和
        int choose = 1;//链表选择器
        int val1;//链表1临时存储
        int val2;//链表2临时存储
        while (cursor1 != null || cursor2 != null) {
            if (cursor1 != null) {
                val1 = cursor1.val;
            } else {
                val1 = 0;
                choose = 2;
            }

            if (cursor2 != null) {
                val2 = cursor2.val;
            } else {
                val2 = 0;
            }
            curVal = val1 + val2;
            if (cursor1 != null) {
                setValue(cursor1, curVal);
                cursor1 = cursor1.next;
            }
            if (cursor2 != null) {
                if (curVal > 9) {//如果两数之和大于9，只选择其中一个链表的next.val+1
                    curVal = curVal - 10;
                }
                setValue(cursor2, curVal);
                cursor2 = cursor2.next;
            }
        }
        if (choose == 2) return l2;
        return l1;
    }

    /**
     * 为链表节点设置值
     *
     * @param node 节点
     * @param val  值
     */
    public void setValue(ListNode node, int val) {
        if (val < 10) {
            node.val = val;
        } else {//next.val+1
            node.val = val - 10;
            if (node.next != null) {
                setValue(node.next, node.next.val + 1);
            } else {
                node.next = new ListNode(1);
            }
        }
    }

}
