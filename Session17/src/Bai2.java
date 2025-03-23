import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        String s = input.nextLine();
        boolean isContains = set.contains(s);
        System.out.println(isContains? "Có" : "Không");
    }
}
