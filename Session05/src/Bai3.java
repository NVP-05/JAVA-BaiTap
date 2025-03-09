import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Giá trị không hợp lệ");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i+  "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int countEven = 0;
        for(int num: arr){
            if(num%2==0) countEven++;
        }
        System.out.println("Tổng số chẵn: " + countEven);
    }
}