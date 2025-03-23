import java.util.HashSet;
import java.util.Set;

public class Bai5 {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 1; i <= 5; i++){
            set1.add(i);
        }

        for(int i = 1; i <= 5; i++){
            set2.add(i + 3);
        }
        set1.addAll(set2);
        set1.forEach(e -> System.out.print(e + " "));
    }
}
