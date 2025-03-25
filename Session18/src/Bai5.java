import java.util.*;
import java.util.stream.Collectors;

public class Bai5 {
    public static void main(String[] args) {
        Map<String, Integer> prd = new HashMap<>();
        prd.put("apple", 1300);
        prd.put("banana", 3300);
        prd.put("cherry", 2250);
        prd.put("mango", 1400);
        Map<String, Integer> filteredAndSortedPrd = prd.entrySet().stream()
                .filter(entry -> entry.getValue() >= 500 && entry.getValue() <= 1500)
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sau khi lọc và sắp xếp:");
        filteredAndSortedPrd.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
