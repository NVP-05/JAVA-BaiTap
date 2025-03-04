import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Vui lòng nhập số nguyên dương");
        }else{
            System.out.println("Cac so Palindrome tu 1 den " + n + " la:");
            for (int i = 1; i <= n; i++) {
                int original = i;
                int reversed = 0;
                int temp = i;
                while (temp > 0) {
                    int digit = temp % 10;
                    reversed = reversed * 10 + digit;
                    temp = temp / 10;
                }
                if (original == reversed) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}