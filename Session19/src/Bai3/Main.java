package Bai3;

import java.util.Scanner;

public class Main {
    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b: ");
        int b = Integer.parseInt(sc.nextLine());

        MathOperation mathOperation = MathOperations::add;
        MathOperation mathOperation2 = MathOperations::subtract;
        MathOperation mathOperation3 = MathOperations::multiply;
        MathOperation mathOperation4 = MathOperations::divide;

        System.out.println("a + b = " + mathOperation.operation(a, b));
        System.out.println("a - b = " + mathOperation2.operation(a, b));
        System.out.println("a * b = " + mathOperation3.operation(a, b));
        System.out.println("a / b = " + mathOperation4.operation(a, b));
    }
}