import java.util.Scanner;

public class Bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasPerfectNumber = false;
        System.out.println("Các số hoàn hảo nhỏ hơn " + n + " là:");
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for(int j = 1; j <= i / 2; j++){
                if (i % j == 0) sum += j;
            }
            if(sum == i){
                System.out.println(i + " ");
                hasPerfectNumber = true;
            }
        }
        if(!hasPerfectNumber){
            System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
        }
    }
}