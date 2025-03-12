import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("a1: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.printf("b1: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.printf("c1: ");
        int c = Integer.parseInt(sc.nextLine());
        System.out.println();

        QuadraticEquation q1 = new QuadraticEquation(a, b, c);

        System.out.printf("a2: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.printf("b2: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.printf("c2: ");
        c = Integer.parseInt(sc.nextLine());
        System.out.println();

        QuadraticEquation q2 = new QuadraticEquation(a, b, c);

        System.out.printf("a3: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.printf("b3: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.printf("c3: ");
        c = Integer.parseInt(sc.nextLine());
        System.out.println();

        QuadraticEquation q3 = new QuadraticEquation(a, b, c);

        q1.display();
        System.out.println();
        q2.display();
        System.out.println();
        q3.display();
    }
}