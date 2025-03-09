import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replaceAll("\\d", "*");
        System.out.println(result);
    }
}