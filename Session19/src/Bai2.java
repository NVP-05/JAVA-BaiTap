import java.util.function.Function;

public class Bai2 {
    public static void main(String[] args) {
        Function<Integer, Integer> caculator = x -> x * x + 3 * x + 2;
        int result = caculator.apply(1);
        int result2 = caculator.apply(2);
        int result3 = caculator.apply(3);

        System.out.println("F1 = " + result);
        System.out.println("F2 = " + result2);
        System.out.println("F3 = " + result3);
    }
}