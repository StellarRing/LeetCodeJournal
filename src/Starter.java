import algorithm.AddTwoNumbers.AddTwoNumbers;
import algorithm.AddTwoNumbers.ListNode;

/**
 * Description:
 *
 * @author WangCheng
 * @version 1.0
 * @Date 2018/8/15 13:56
 */
public class Starter {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);

        ListNode listNode2 = new ListNode(7);
        listNode2.next=new ListNode(3);

        ListNode result = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);
    }

}