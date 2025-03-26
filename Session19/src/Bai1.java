import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Bai1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("");
        strings.add("Lambda");
        strings.add("");
        strings.add("Stream");
        strings.add("");
        strings.add("Functional");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> filtered = new ArrayList<>();
        for (String str : strings) {
            if (predicate.test(str)) {
                filtered.add(str);
            }
        }
        System.out.println(filtered);
    }
}