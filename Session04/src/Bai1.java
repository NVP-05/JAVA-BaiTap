import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        if(N < 1){
            System.out.println("Số nhập vào không hợp lệ");
        }else {
            for(int i = 1; i <= N; i++){
                sum += i;
            }
            System.out.println("Tổng các số từ 1 đến " + N + " là: " + sum);
        }
    }
}
