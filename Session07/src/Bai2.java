import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Hello, Java World!");
        System.out.println(str);
        System.out.println(str.delete(5,9));
        System.out.println(str.delete(5,9).replace(5, 14," Universe"));
    }
}