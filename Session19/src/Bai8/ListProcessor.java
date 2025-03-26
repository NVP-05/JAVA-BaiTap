package Bai8;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public interface ListProcessor {
    int sumOddNumbers(List<Integer> list);

    void printList(List<Integer> list);

    default List<Integer> checkOdd(List<Integer> list) {
        Predicate<Integer> isOdd = i -> i % 2 != 0;
        List<Integer> oddList = new ArrayList<>();

        for (Integer num : list) {
            if (isOdd.test(num)) {
                oddList.add(num);
            }
        }
        return oddList;
    }
}