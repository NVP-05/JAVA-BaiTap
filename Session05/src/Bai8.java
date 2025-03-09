import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] arr = new int[n];
        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.print("[");
        for (int i = 0;i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0;i < uniqueCount; i++) {
            System.out.print(uniqueArr[i]);
            if(i != uniqueCount - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}