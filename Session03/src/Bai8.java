import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 0) {
            if(b == 0){
                if(c == 0){
                    System.out.println("vô số nghiệm");
                }else{
                    System.out.println("vô nghiệm");
                }
            }else{
                double x = -c / b;
                System.out.println("pt có 1 nghiệm: x = " + x);
            }
        }else {
            double delta = b * b - 4 * a * c;
            if(delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("pt có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }else if (delta == 0){
                double x =  -b / (2 * a);
                System.out.println("pt có 1 nghiệm: x = " + x);
            }else {
                System.out.println("pt vô nghiệm");
            }
        }
    }
}