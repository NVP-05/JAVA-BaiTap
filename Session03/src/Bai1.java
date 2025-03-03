import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        } else if (num % 2 == 0) {
            System.out.println("Số chẵn");
        }
        else {
            System.out.println("Số lẻ");
        }
    }
}