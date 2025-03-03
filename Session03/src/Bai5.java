import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char choice = sc.next().charAt(0);
        int num2 = sc.nextInt();
        switch (choice){
            case '+'-> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            case '-'-> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            case '*' -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            case '/' -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            default -> System.out.println("Phép toàn không hợp lệ");
        }
    }
}