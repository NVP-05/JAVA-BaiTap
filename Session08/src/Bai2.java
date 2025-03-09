import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        do{
            System.out.println("n không hợp lệ vui lòng nhập lại: n = ");
            n = sc.nextInt();
        }while(n <= 0);

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int countDiv3 = 0;
        int sumDiv3 = 0;
        for(int num: arr){
            if(num % sumDiv3 == 0){
                sumDiv3 = num / sumDiv3;
                countDiv3++;
            }
        }

        if(countDiv3 == 0){
            System.out.println("Không có phần tử chia hết cho 3");
        }else{
            System.out.println("Tổng = " + sumDiv3);
        }
    }
}