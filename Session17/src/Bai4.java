import java.util.Set;
import java.util.TreeSet;

public class Bai4 {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<Integer>();
        set.add(45);
        set.add(12);
        set.add(78);
        set.add(34);
        set.add(23);
        set.add(89);
        set.forEach(e -> System.out.print(e + " "));
    }
}
