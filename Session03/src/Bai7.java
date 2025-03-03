import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b <= c && b + c <= a &&  a + c <= b){
            System.out.println("Ba cạnh không tạo thành tam giác");
        }else{
            if(a == b  && a == c && b == c){
                System.out.println("Tam giác đều");
            } else if (a == b  || a == c || b == c) {
                System.out.println("Tam giác cân");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");
            }else {
                System.out.println("Tam giác thường");
            }
        }
    }
}