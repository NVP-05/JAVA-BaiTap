package Bai7;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        Predicate<Integer> isNegative = i -> i < 0;
        for (Integer i : list) {
            if (isNegative.test(i)) {
                return true;
            }
        }
        return false;
    }
}