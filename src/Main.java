import M.RemvNthNodeFromEndOfLinkedList;
import Support.ListNode;

import java.util.*;

/**
 * Created by qiaozhen on 09/07/2017.
 */


public class Main {
    public static void main(String[] args) {

        H.MergeKSortedLists Q = new H.MergeKSortedLists();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Random ran = new Random();
            int x = ran.nextInt(1000) + 1;
            list.add(x);
        }
        ArrayList<ListNode> test = new ArrayList<>();
        for (Integer i : list) {
            test.add(new ListNode(i));
        }
        ListNode[] array = (ListNode[])test.toArray(new ListNode[test.size()]);
        String s = "";
        ListNode n = Q.solution(array);
        while (n != null) {
            s = s + n.value + ",";
            n = n.next;
        }
        System.out.print(s);
    }
}