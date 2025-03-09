import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Giá trị không hợp lệ");
            return;
        }
        int[] arr = new int[n];
        if(arr.length == 0){
            System.out.println("Mảng rỗng");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
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

        for(int i = 0; i < arr.length; i++){
            int key =  arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = key;
        }
        System.out.print("Mảng sau khi hoán đổi");
    }
}