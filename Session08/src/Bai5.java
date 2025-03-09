import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int choice;
        int currentIndex = 0;

        do {
            System.out.println("******************** MENU ********************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng `k`");
            System.out.println("5. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập n: ");
                    currentIndex = Integer.parseInt(sc.nextLine());

                    for(int i = 0; i < currentIndex; i++) {
                        System.out.print("arr[" + (i + 1) + "] = ");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("[");
                    for(int i = 0; i < currentIndex; i++) {
                        System.out.print(i);
                        if(i != currentIndex - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                    break;
                case 3:
                    int countPos = 0;
                    int sumPos = 0;
                    for(int i = 0; i < currentIndex; i++) {
                        if(arr[i] > 0){
                            sumPos += arr[i];
                            countPos++;
                        }
                    }
                    int avg = sumPos / countPos;
                    System.out.println("Trung bình các phần tử dương: " + avg);
                    break;
                case 4:
                    System.out.print("Mời nhập k: ");
                    int k = sc.nextInt();
                    int index = -1;
                    for(int i = 0; i < currentIndex; i++) {
                        if(k == arr[i]) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) {
                        System.out.println("Phần tử " + k + " nằm ở vị trí " + index);
                    }else{
                        System.out.println("Không tìm thấy phần tử " + k + " trong mảng");
                    }
                    break;
                case 5:
                    int sumPrime = 0;
                    boolean isPrime = true;
                    for(int i = 0; i < currentIndex; i++) {
                        for(int j = 0; j < Math.sqrt(arr[i]); j++) {
                            if(arr[i] % j == 0){
                                isPrime = false;
                                break;
                            }
                        }
                        if(isPrime){
                            sumPrime += arr[i];
                        }else{
                            continue;
                        }
                    }
                    System.out.println("Tổng các số nguyên tố: " + sumPrime);
                    break;
                case 6:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }
}