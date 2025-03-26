package Bai6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("lambda");
        list.add("stream");
        list.add("functional");

        StringProcessor newString = (string) -> string.toUpperCase() + " - TECHNICAL";

        List<String> newList = new ArrayList<>();
        for (String str : list) {
            newList.add(newString.processString(str));
        }

        newString.printList(newList);
    }
}