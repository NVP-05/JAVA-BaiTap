import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[100][100];
        int choice = 0;
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        do{
            System.out.println("Menu");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In ra giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In ra phần tử và tổng phần tử nằmtreenn đường biên, đương chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng, thực hiện chèn vào mảng 2 chiều");
            System.out.println("9. Thoát ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Mời nhập n: ");
                    n = Integer.parseInt(sc.nextLine());
                    System.out.print("Mời nhập m: ");
                    m = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i < n; i++){
                        for(int j = 0; j < m; j++){
                            System.out.print("arr[" + i + "][" + j + "] = ");
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    for(int i = 0; i < n; i++){
                        for(int j = 0; j < m; j++){
                            System.out.print(arr[i][j] + "");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int countDiv2And3 = 0;
                    for(int i = 0; i < n; i++){
                        for(int j = 0; j < m; j++){
                            if(arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0){
                                countDiv2And3++;
                            }
                        }
                    }
                    System.out.println("Tính số lượng các phần tử cho 2 và 3 trong mảng: " + countDiv2And3);
                    break;
                case 4:
                    int sum = 0;
                    System.out.println("\nCác phần tử trên đường biên, đường chéo chính và đường chéo phụ:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                                System.out.print(arr[i][j] + " ");
                                sum += arr[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("\nTổng các phần tử trên đường biên, đường chéo chính và đường chéo phụ: " + sum);
                    break;
                case 5:
                    for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int k = i + 1; k < n; k++) {
                                if (arr[i][j] > arr[k][j]) {
                                    int temp = arr[i][j];
                                    arr[i][j] = arr[k][j];
                                    arr[k][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo cột!");
                    break;
                case 6:
                    System.out.println("Các số nguyên tố trong mảng:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            boolean isPrime = true;
                            if (arr[i][j] < 2) isPrime = false;
                            else {
                                for (int k = 2; k * k <= arr[i][j]; k++) {
                                    if (arr[i][j] % k == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) System.out.print(arr[i][j] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Nhập giá trị của mảng 1D:");
                    int[] newRow = new int[m];
                    for (int j = 0; j < m; j++) {
                        System.out.print("newRow[" + j + "] = ");
                        newRow[j] = Integer.parseInt(sc.nextLine());
                    }

                    System.out.print("Nhập chỉ số dòng để chèn (0 - " + (n - 1) + "): ");
                    int rowIndex = Integer.parseInt(sc.nextLine());

                    if (rowIndex >= 0 && rowIndex < n) {
                        for (int j = 0; j < m; j++) {
                            arr[rowIndex][j] = newRow[j];
                        }
                        System.out.println("Đã chèn mảng vào dòng " + rowIndex);
                    } else {
                        System.out.println("Chỉ số dòng không hợp lệ!");
                    }
                    break;
                case 9:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        while (true);
    }
}