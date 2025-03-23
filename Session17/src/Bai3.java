import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 10; i++){
            set.add(i + 1);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        set.forEach(e -> System.out.print(e + " "));
    }
}
