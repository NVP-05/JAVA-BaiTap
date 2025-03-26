package Bai7;

import java.util.List;

public interface ListProcessor {
    boolean containsNegative(List<Integer> list);

    static void printList(List<Integer> list) {
        System.out.println("List: " + list);
    }
}