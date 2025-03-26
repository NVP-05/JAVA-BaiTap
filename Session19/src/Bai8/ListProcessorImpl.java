package Bai8;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public int sumOddNumbers(List<Integer> list) {
        List<Integer> oddList = checkOdd(list);
        int sum = 0;
        for (int num : oddList) {
            sum += num;
        }
        return sum;
    }

    @Override
    public void printList(List<Integer> list) {
        List<Integer> oddList = checkOdd(list);
        System.out.println("List số lẻ: " + oddList);
    }
}