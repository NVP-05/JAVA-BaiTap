import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.print("Nhập độ dài mảng: ");
        int size = Integer.parseInt(sc.nextLine());

        while(size < 0){
            System.out.println("Độ dài mảng không được âm.");
            size = Integer.parseInt(sc.nextLine());
        }

        for(int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ",i + 1);
            nums.add(Integer.parseInt(sc.nextLine()));
        }

        HashSet<Integer> set = new HashSet<Integer>(nums);
        System.out.println(set);
    }
}
