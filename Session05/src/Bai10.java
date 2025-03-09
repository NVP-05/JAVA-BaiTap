import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập n: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int currentSum = 0;
        int maxSum = 0;
        for (int num : arr) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        if (maxSum < 0) {
            maxSum = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            }
        }

        System.out.println("Tổng lớn nhất của dãy con liên tiếp: " + maxSum);
    }
}