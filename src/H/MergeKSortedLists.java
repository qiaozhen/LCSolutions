package H;

import java.util.*;
import Support.ListNode;

public class MergeKSortedLists {
    public ListNode solution(ListNode[] lists) {
        ListNode l = new ListNode(0);
        ListNode res = l;
        int x = 0;
        int nc = 0;
        while (nc < lists.length - 1) {
            nc = 0;
            int index = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    nc ++;
                }
                else {
                    if (index == -1) {
                        index = i;
                    }
                    else if (lists[index].value > lists[i].value) {
                        index = i;
                    }
                }
            }
            if (index != -1) {
                l.next = lists[index];
                l = l.next;
                lists[index] = lists[index].next;
                System.out.print(x++ +"\n");
            }
        }
        if (nc == lists.length - 1) {
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) l.next = lists[i];
            }
        }

        return res.next;
    }
}
