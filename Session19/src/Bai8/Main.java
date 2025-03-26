package Bai8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(17, 11, 10, 13, 6, 9);

        ListProcessor newList = new ListProcessorImpl();

        System.out.println("Danh sách số lẻ: ");
        newList.printList(list);


        int sumOdd = newList.sumOddNumbers(list);
        System.out.println("Tổng số lẻ: " + sumOdd);

    }
}