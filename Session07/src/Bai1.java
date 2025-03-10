import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder StringBuilder = new StringBuilder();
        int strSize = 3;
        for(int i = 0; i < strSize; i++){
            StringBuilder.append(scanner.nextLine());
        }
        System.out.println(StringBuilder.toString().toUpperCase());
    }
}