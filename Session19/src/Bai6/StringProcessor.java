package Bai6;

import java.util.List;

public interface StringProcessor {
    String processString(String string);

    default void printList(List<String> list) {
        System.out.println("List: " + list);
    }
}