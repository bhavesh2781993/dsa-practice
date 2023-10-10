package leetcode;

public class P006_MergeSortLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;

        ListNode list4 = new ListNode(1);
        ListNode list5 = new ListNode(3);
        ListNode list6 = new ListNode(4);
        list4.next = list5;
        list5.next = list6;

        printListNode(list1);
        printListNode(list4);

        final ListNode mergedList = mergeTwoLists(null, null);
        printListNode(mergedList);
    }

    private static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + ", ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode firstNode = null;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (result == null) {
                    result = new ListNode();
                    firstNode = result;
                } else {
                    result.next = new ListNode();
                    result = result.next;
                }
                result.val = list1.val;
                list1 = list1.next;
            } else {
                if (result == null) {
                    result = new ListNode();
                    firstNode = result;
                } else {
                    result.next = new ListNode();
                    result = result.next;
                }
                result.val = list2.val;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            if (result == null) {
                result = new ListNode();
                firstNode = result;
            } else {
                result.next = new ListNode();
                result = result.next;
            }
            result.val = list1.val;
            list1 = list1.next;
        }

        while (list2 != null) {
            if (result == null) {
                result = new ListNode();
                firstNode = result;
            } else {
                result.next = new ListNode();
                result = result.next;
            }
            result.val = list2.val;
            list2 = list2.next;
        }

        return firstNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}