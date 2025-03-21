import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            nums.add(i + 1);
        }
        System.out.println("Array List " + nums);

        nums.removeIf(num -> num % 3 == 0);

        for(int num : nums){
            System.out.println(num);
        }
    }
}
