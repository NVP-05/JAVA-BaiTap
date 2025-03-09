import java.util.Scanner;

public class Bai1 {
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
        int max = arr[0];
        int min = arr[0];
        for(int num: arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}