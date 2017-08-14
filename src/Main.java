import M.RemvNthNodeFromEndOfLinkedList;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by qiaozhen on 09/07/2017.
 */


public class Main {
    public static void main(String[] args) {
        M.ValidSodoku Q = new M.ValidSodoku();
        char[] r0 = ".87654321".toCharArray();
        char[] r1 = "2........".toCharArray();
        char[] r2 = "3........".toCharArray();
        char[] r3 = "4........".toCharArray();
        char[] r4 = "5........".toCharArray();
        char[] r5 = "6........".toCharArray();
        char[] r6 = "7........".toCharArray();
        char[] r7 = "8........".toCharArray();
        char[] r8 = "9........".toCharArray();
        System.out.print(Q.solution(new char[][]{r0,r1,r2,r3,r4,r5,r6,r7,r8}));
    }
}