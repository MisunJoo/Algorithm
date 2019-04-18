package leetcode;

/*
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
* */

public class MergeTwoSortedLists {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode result = mergeTwoLists(l1, l2);

//    System.out.println(l1.val);
//    System.out.println(l1.next.val);
//    System.out.println(l1.next.next.val);
//
//    while (l1!= null){
//      System.out.println(l1.val);
//      l1 = l1.next;
//    }

    while (result!= null){
      System.out.println(result.val);
      result = result.next;
    }



  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;

    ListNode result;

    if (l1.val > l2.val){
      result = new ListNode(l2.val);
      mergeTwoLists(l1.next, l2.next);
    }else {
      result = new ListNode(l1.val);
      mergeTwoLists(l1.next, l2.next);
    }
    return result;
  }

  public static class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }



}
