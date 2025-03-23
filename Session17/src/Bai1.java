import java.util.HashSet;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i <= 5; i++){
            set.add(i * 10);
        }
        set.forEach(e -> System.out.print(e + " "));
    }
}
