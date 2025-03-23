import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bai6 {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 1; i <= 4; i++){
            set1.add(i * 10);
        }
        for(int i = 3; i <= 7; i++){
            set2.add(i * 10);
        }
        set1.retainAll(set2);
        Set<Integer> sortedResult = new TreeSet<>(set1);
        System.out.println(sortedResult);
    }
}
