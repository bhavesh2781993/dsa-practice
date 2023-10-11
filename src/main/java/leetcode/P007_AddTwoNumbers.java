package leetcode;

// TODO: NOT ABLE TO HANDLE LARGE NOS
public class P007_AddTwoNumbers {
    public static void main(String[] args) {

        ListNode1 lst1 = createList(753865680);
        ListNode1 lst2 = createList(798580876);

        print(lst1);
        print(lst2);
        final ListNode1 result = addTwoNumbers(lst1, lst2);
        print(result);
    }

    private static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        long no1 = getNo(l1);
        long no2 = getNo(l2);

        no1 = reverseNo(no1);
        no2 = reverseNo(no2);

        long sum = no1 + no2;

        if (sum == 0) {
            return new ListNode1(0);
        } else {
            return createList(sum);
        }
    }

    private static long getNo(ListNode1 listNode1) {
        long no = 0;
        while (listNode1 != null) {
            no = no * 10 + listNode1.val;
            listNode1 = listNode1.next;
        }
        return no;
    }

    private static long reverseNo(long no) {
        long reverse = 0;
        while (no != 0) {
            long remainder = no % 10;
            reverse = reverse * 10 + remainder;
            no = no / 10;
        }
        return reverse;
    }

    private static ListNode1 createList(long no) {
        ListNode1 result = null;
        ListNode1 head = null;
        while (no != 0) {
            int remainder = (int) (no % 10);
            if (result == null) {
                result = new ListNode1(remainder);
                head = result;
            } else {
                result.next = new ListNode1(remainder);
                result = result.next;
            }
            no = no / 10;
        }
        return head;
    }

    private static void print(ListNode1 listNode1) {
        while (listNode1 != null) {
            System.out.print(listNode1.val + ", ");
            listNode1 = listNode1.next;
        }
        System.out.println();
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}