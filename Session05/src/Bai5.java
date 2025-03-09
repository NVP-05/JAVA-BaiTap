import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Giá trị không hợp lệ");
            return;
        }
        int[] arr = new int[n];
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

        boolean foundOdd = false;
        int maxOdd = arr[0];
        int minOdd = arr[0];
        for(int num: arr){
            if(num % 2 != 0 && num > 0){
                foundOdd = true;
                if(num > maxOdd) maxOdd = num;
            }
        }

        if(foundOdd){
            System.out.println("Không có phần tử lẻ trong mảng");
        }else{
            System.out.println("Phần tử lẻ nguyên dương lớn nhất là: " + maxOdd + "" + ", " + "Phần tử lẻ nguyên dương nhỏ nhất là: " + minOdd);
        }
    }
}