import java.util.Scanner;

public class Bai9  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập n: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Ma trận không hợp lệ.");
            return;
        }

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Trước khi xoay: ");
        for (int[] row: arr) {
            for(int i: row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        System.out.println("Sau khi xoay: ");
        for (int[] row: arr) {
            for(int i: row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}