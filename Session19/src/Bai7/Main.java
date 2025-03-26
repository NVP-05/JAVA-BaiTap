package Bai7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(5, -2, 10, 0, -7, 3);
//        List<Integer> arrayList = Arrays.asList(5, 11, 10, 0, 9, 3);

        ListProcessor checkNumber = new ListProcessorImpl();

        if (checkNumber.containsNegative(arrayList)) {
            System.out.println("Danh sách có số âm.");
        } else {
            System.out.println("Danh sách không có số âm.");
        }
    }
}