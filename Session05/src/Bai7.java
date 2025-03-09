import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if(num % 2 == 0){
                sortedArr[currentIndex++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sortedArr[currentIndex++] = arr[i];
            }
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.printf("[");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]);
            if(i != sortedArr.length-1){
                System.out.printf(", ");
            }
        }
        System.out.println("]");

    }
}