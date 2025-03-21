import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();

        int size = Integer.parseInt(sc.nextLine());
        while(size < 0){
            System.out.println("Độ dài mảng không được âm.");
            size = Integer.parseInt(sc.nextLine());
        }

        for(int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ",i + 1);
            nums.add(Integer.parseInt(sc.nextLine()));
        }

        List<Integer> primeNums = new ArrayList<Integer>();
        List<Integer> oddNums = new ArrayList<Integer>();
        List<Integer> evenNums = new ArrayList<Integer>();

        for(int num : nums){
            if(isPrime(num)){
                primeNums.add(num);
            }else if(num % 2 == 0){
                evenNums.add(num);
            }else{
                oddNums.add(num);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
