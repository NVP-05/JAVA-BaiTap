import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            nums.add((int)(100 * Math.random()));
        }
        System.out.println("Array List: " + nums);

        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);
    }
}
