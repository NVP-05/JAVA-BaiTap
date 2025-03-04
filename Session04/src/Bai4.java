import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do{
            n = sc.nextInt();
            sum += n;
        }
        while (n != 0);
        System.out.println("Số được in ra là: " + sum);
    }
}