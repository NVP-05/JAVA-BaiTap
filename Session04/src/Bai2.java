import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n < 2){
            System.out.println(n +" không phải số nguyên tố");
        }else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    count+=1;
                    break;
                }
            }
            if(count != 0){
                System.out.println("n không phải là số nguyên tố");
            }else {
                System.out.println("n là số nguyên tố");
            }
        }
    }
}
